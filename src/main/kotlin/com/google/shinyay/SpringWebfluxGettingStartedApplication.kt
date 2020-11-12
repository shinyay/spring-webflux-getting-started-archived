package com.google.shinyay

import com.google.shinyay.client.HelloClient
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringWebfluxGettingStartedApplication

fun main(args: Array<String>) {
//	runApplication<SpringWebfluxGettingStartedApplication>(*args)
	SpringApplicationBuilder()
			.sources(SpringWebfluxGettingStartedApplication::class.java)
			.web(WebApplicationType.REACTIVE)
			.run(*args)
	HelloClient().getResult()
}

val Any.logger: Logger
	get() = LoggerFactory.getLogger(this.javaClass)