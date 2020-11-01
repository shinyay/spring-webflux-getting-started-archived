package com.google.shinyay.router

import com.google.shinyay.handler.HelloHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.*


@Configuration
class HelloRouter(val handler: HelloHandler) {

    @Bean
    fun route() = router { accept(MediaType.APPLICATION_JSON).nest { GET("/hello", handler::hello) } }
}