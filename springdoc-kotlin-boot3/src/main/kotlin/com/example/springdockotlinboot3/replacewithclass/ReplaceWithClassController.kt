package com.example.springdockotlinboot3.replacewithclass

import io.swagger.v3.oas.annotations.media.Schema
import org.springdoc.core.utils.SpringDocUtils
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * https://github.com/springdoc/springdoc-openapi/issues/2226
 *
 * 原因: swagger-core で Schemaの設定を行っているため@Schemaの設定は利用されない
 * javadocはswagger-coreで設定後にdescriptionのみを設定しているため反映される
 * これは仕様的に仕方ないか
 */
@RestController
@RequestMapping("/replaceWithClass")
class ReplaceWithClassController {
    companion object {
        init {
            SpringDocUtils.getConfig().replaceWithClass(ReplaceWithClass::class.java, String::class.java)
        }
    }

    @GetMapping("/schema")
    fun getSchemaResponse(): Response = Response()

}

@Schema(description = "Demo response object")
data class Response(
    @field:Schema(description = "Local schema description (replaceWithClass)")
    val replaceWithClass: ReplaceWithClass = ReplaceWithClass(),
    @field:Schema(description = "Local schema description (\'type\' override)", type = "string")
    val typeOverride: TypeOverride = TypeOverride()
)

@Schema(description = "Class-level schema: ReplaceWithClass")
data class ReplaceWithClass(var str: String = "demo")
@Schema(description = "Class-level schema: TypeOverride")
data class TypeOverride(var str: String = "demo")

@Schema()
class StringSchema {

}
