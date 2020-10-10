package me.wonsang.halrestfulwebservice.controller

import me.wonsang.halrestfulwebservice.Greeting
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn
import org.springframework.http.HttpEntity
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController {

    private val TEMPLATE: String = "Hello, %s!"

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): HttpEntity<Greeting> {
        val greeting = Greeting(String.format(TEMPLATE, name))
        greeting.add(linkTo(methodOn(GreetingController::class.java).greeting(name)).withSelfRel())
        return ResponseEntity.ok(greeting)
   }
}