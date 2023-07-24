# Overview

Testing out [xef.ai](https://xef.ai).

## Requirements

- `OPENAI_TOKEN` env var set to one of your [OpenAI API Keys](https://platform.openai.com/account/api-keys)
- Java 19+
    - Included `.java-version` instructs `jenv` to use Java 20, change as needed
- Run sbt using `sbt -J--enable-preview`

## Questions

- in story example, why are animal and invention parsed, but story is not?
```
Animal(Axolotl,Freshwater,Carnivorous)
Invention(Internet,Tim Berners-Lee,1989,Global communication and information sharing)
Story about Axolotl and Internet:
```
- why does it make multiple reqs to openai for single prompt?
- and why does it log all of those ^^ to (assuming) stdout?
- how to log/capture the full prompt + output?
- how can we impl support for other LLMs (e.g. gcp vertex)?
