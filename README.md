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
Define **REACIVE**

```kotlin
fun main(args: Array<String>) {
    SpringApplicationBuilder()
            .sources(DemoApplication::class.java)
            .web(WebApplicationType.REACTIVE)
            .run(*args)
}
```

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
