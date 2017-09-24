# FINT Springer

https://travis-ci.org/FINTprosjektet/fint-springer.svg?branch=master

## Add more data

1. Create a new json-file containing the data inside `src/main/resources/data`.
2. Create a new model class, either in its own package inside `no.fint.springer`, or inside `no.fint.codelist`. The name of the model should be the same as the name of the json-file.
3. Add a service-class named the same as the model and with `Service` at the end.
4. Update the `Resources`-enum with the new value.
5. Run the mongodb integration tests `ExampleDataLoaderSpec`.

## Run locally

Start the `TestApplication` class in `src/test/groovy`, this will start an embedded mongodb.

## Integration tests

Enable by setting this system property:  
`-DenableMongodbTests=true`

## References

* [Embedded mongodb](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html#boot-features-mongo-embedded)