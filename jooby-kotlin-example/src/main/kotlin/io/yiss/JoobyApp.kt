package io.yiss

import org.jooby.*

/**
 * Kotlin stater project.
 */
class App : Kooby({

    get {
        val name = param("name").value("Jooby")
        "Hello $name!"
    }

})

/**
 * Run application:
 */
fun main(args: Array<String>) {
    run(::App, *args)
}