package com.example.springdockotlinboot3.isnamevisible

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/isNameVisible")
class IsNameVisibleController {
    @GetMapping
    fun getSchemaResponse(): Response = Response()
}
