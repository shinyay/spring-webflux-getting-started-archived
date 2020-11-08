# Getting Start with Reactive REST Web Service with WebFlux 

Overview

## Description
### Dependency
- spring-boot-starter-webflux

```kotlin
dependencies {
	implementation("org.springframework.boot:spring-boot-starter-webflux")
}
```

### WebApplicationType.REACTIVE
The application should run as a **REACTIVE** web application and should start an embedded reactive web server.

```kotlin
fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(DemoApplication::class.java)
            .web(WebApplicationType.REACTIVE)
            .run(*args)
}
```
### Functional Endpoints
WebFlux.fn are used to route and handle requests and contracts.

HTTP request is handled with a `HandlerFunction`.
HandlerFunction takes `ServerRequest` and returns a delayed `ServerResponse`.

- `Mono<ServerResponse>`
- `Flux<ServerResponse>`

### WebFlux Handler
We use a **handler** to handle the request and create a response for Spring Reactive.
HandlerFunction is equivalent of the body of a `@RequestMapping` method.
`RouterFunction` is the equivalent of a `@RequestMapping` annotation

#### Router Function
Router functions are evaluated in order.
If the first route does not match, the second is evaluated, and so on. 
This behavior is different from the annotation-based programming model.

```kotlin
@Bean
fun route() = router {
    accept(MediaType.APPLICATION_JSON)
            .nest { GET("/person", handler::listPeople)
                    GET("/person/{id}", handler::getPerson)
            }
}
```

#### ServerResponse
ServerResponse provides access to the HTTP response.
You can set the response status, to add response headers, or to provide a body.

## Demo

## Features

- feature:1
- feature:2

## Requirement

## Usage

## Installation

## Licence

Released under the [MIT license](https://gist.githubusercontent.com/shinyay/56e54ee4c0e22db8211e05e70a63247e/raw/34c6fdd50d54aa8e23560c296424aeb61599aa71/LICENSE)

## Author

[shinyay](https://github.com/shinyay)
