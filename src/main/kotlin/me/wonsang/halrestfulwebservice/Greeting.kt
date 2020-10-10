package me.wonsang.halrestfulwebservice

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.hateoas.RepresentationModel

// @JsonProperty: Marks the field into which Jackson should put this constructor argument.

data class Greeting(
        @JsonProperty("content") val content: String
) : RepresentationModel<Greeting>()
