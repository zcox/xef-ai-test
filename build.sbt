import scala.util.Properties
Global / onChangedBuildSource := ReloadOnSourceChanges

scalaVersion := "3.3.0"

lazy val V = new {
  val logback = "1.2.11"
  val xef = "0.0.2"
}

libraryDependencies ++= Seq(
  "com.xebia" %% "xef-scala" % V.xef,
  "ch.qos.logback" % "logback-classic" % V.logback % Runtime,
)

Compile / javaOptions ++= xefJavaOptions

Test / javaOptions ++= xefJavaOptions

fork := true

Compile / compile := (Compile / compile).dependsOn(failIfTokenNotSet).value

failIfTokenNotSet := {
  Properties
    .envOrNone("OPENAI_TOKEN")
    .map(_ => ())
    .getOrElse[Unit](
      throw new RuntimeException(
        "Your OPENAI_TOKEN environment variable is unset. https://help.openai.com/en/articles/4936850-where-do-i-find-my-secret-api-key for how to obtain a key and set it as the value of the OPENAI_TOKEN environment variable, and restart sbt."
      )
    )
}

lazy val failIfTokenNotSet = taskKey[Unit](
  "If the OPENAI_TOKEN environment variable is not set, this will fail the build."
)

lazy val xefJavaOptions = Seq(
  "-XX:+IgnoreUnrecognizedVMOptions",
  "-XX:-DetectLocksInCompiledFrames",
  "-XX:+UnlockDiagnosticVMOptions",
  "-XX:+UnlockExperimentalVMOptions",
  "-XX:+UseNewCode",
  "--enable-preview"
 )
