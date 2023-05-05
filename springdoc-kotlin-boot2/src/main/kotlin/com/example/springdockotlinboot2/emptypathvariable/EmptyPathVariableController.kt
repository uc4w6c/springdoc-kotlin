package com.example.springdockotlinboot2.emptypathvariable

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2203
 */
@RestController
@RequestMapping("/emptyPathVariable")
class EmptyPathVariableController {
    @GetMapping("{id}")
    fun retrieveXxxById(@PathVariable id: String): String {
        return id
    }
}
