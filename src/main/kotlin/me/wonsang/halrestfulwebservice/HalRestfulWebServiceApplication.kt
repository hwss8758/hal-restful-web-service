package me.wonsang.halrestfulwebservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HalRestfulWebServiceApplication

fun main(args: Array<String>) {
    runApplication<HalRestfulWebServiceApplication>(*args)
}
