package com.ace.devtoys.tools

import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

object JsonPrettyPrinter {
    private val prettyJson = Json { // this returns the JsonBuilder
        prettyPrint = true
        // optional: specify indent
        prettyPrintIndent = " "
    }

    fun prettyPrint(json: String): String {
        val parseToJsonElement = prettyJson.parseToJsonElement(json)
        return prettyJson.encodeToString(parseToJsonElement)
    }

    fun compact(json: String): String {
        val parseToJsonElement = Json.parseToJsonElement(json)
        return Json.encodeToString(parseToJsonElement)
    }
}
