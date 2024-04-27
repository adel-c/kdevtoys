package com.ace.devtoys.tools

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JsonPrettyPrinterTest {

    @Test
    fun prettyPrint() {
        val prettyPrint = JsonPrettyPrinter.prettyPrint(
            """
            {"a":"c","b":"d","c":[1,2,3]}
            """
        )
        assertEquals(
            """
                {
                 "a": "c",
                 "b": "d",
                 "c": [
                  1,
                  2,
                  3
                 ]
                }
            """.trimIndent(), prettyPrint
        )
    }

    @Test
    fun compact() {
        val prettyPrint = JsonPrettyPrinter.compact(
            """
                {
                 "a": "c",
                 "b": "d",
                 "c": [
                  1,
                  2,
                  3
                 ]
                }
            """.trimIndent()
        )
        assertEquals(
            """{"a":"c","b":"d","c":[1,2,3]}""", prettyPrint
        )
    }
}
