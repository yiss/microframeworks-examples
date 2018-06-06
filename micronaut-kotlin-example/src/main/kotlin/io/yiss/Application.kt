package io.yiss

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.runtime.Micronaut

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        Micronaut.build()
                .packages("io.yiss")
                .mainClass(Application.javaClass)
                .start()
    }
}

@Controller
class HelloController {
    @Get("/")
    fun hello() = "Hello World!"
}