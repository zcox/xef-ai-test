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
