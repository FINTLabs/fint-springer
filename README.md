# FINT Springer

[![Build Status](https://travis-ci.org/FINTprosjektet/fint-springer.svg?branch=master)](https://travis-ci.org/FINTprosjektet/fint-springer)

## Run locally

Start the `TestApplication` class in `src/test/groovy`, this will start an embedded mongodb.

## Integration tests

Enable by setting this system property:  
`-DenableMongodbTests=true`

This will start a local mongodb by using [Embedded MongoDB](https://github.com/flapdoodle-oss/de.flapdoodle.embed.mongo).

## References

* [Embedded mongodb](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html#boot-features-mongo-embedded)