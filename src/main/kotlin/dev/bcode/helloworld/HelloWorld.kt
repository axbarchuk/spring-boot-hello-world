package dev.bcode.helloworld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class HelloWorld {

    @GetMapping
    fun sayHello() = "Hello World!"

    @GetMapping("/{name}")
    fun sayHello(@PathVariable name: String) = "Hey ${name}!"

}