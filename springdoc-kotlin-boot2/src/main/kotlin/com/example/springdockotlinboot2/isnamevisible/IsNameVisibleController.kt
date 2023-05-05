package com.example.springdockotlinboot2.isnamevisible

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2229
 */
@RestController
@RequestMapping("/isNameVisible")
class IsNameVisibleController {
    @GetMapping
    fun getSchemaResponse(): Response = Response()
}
