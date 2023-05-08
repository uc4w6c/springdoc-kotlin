package com.example.springdockotlinboot3.isnamevisible

import io.swagger.v3.oas.annotations.media.Schema

@Schema(description = "Demo response object")
data class Response(
    @field:Schema(description = "My boolean field description", example = "false")
    val isMyBoolean: Boolean = false,
    @field:Schema(description = "Schema description (foo)", example = "true")
    val isFoo: Boolean = false,
    @field:Schema(description = "Schema description (bar)", example = "true")
    val bar: Boolean = false
)
