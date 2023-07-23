# Overview

Testing out [xef.ai](https://xef.ai).

## Requirements

- `OPENAI_TOKEN` env var set to one of your [OpenAI API Keys](https://platform.openai.com/account/api-keys)
- Java 19+
    - Included `.java-version` instructs `jenv` to use Java 20, change as needed
- Run sbt using `sbt -J--enable-preview`

## Questions

- in wine example, why is wine category not parsed?
- in story example, why are animal and invention parsed, but story is not?
- why does it make multiple reqs to openai for single prompt?
- and why does it log all of those ^^ to (assuming) stdout?
- how to log/capture the full prompt + output?
- how can we impl support for other LLMs (e.g. gcp vertex)?
