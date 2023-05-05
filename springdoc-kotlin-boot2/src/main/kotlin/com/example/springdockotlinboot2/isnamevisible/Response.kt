package com.example.springdockotlinboot2.isnamevisible

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Demo response object")
data class Response(
    @field:Schema(description = "My boolean field description", example = "false")
    val isMyBoolean: Boolean = false
)
