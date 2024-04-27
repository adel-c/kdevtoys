package com.ace.devtoys.tools

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JwtDecoderTest {

    @Test
    fun decodePayload() {
        val sampleToken =
            "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c";

        assertEquals(
            """{"sub":"1234567890","name":"John Doe","iat":1516239022}""",
            JwtDecoder.decodePayload(sampleToken)
        )
    }
}
