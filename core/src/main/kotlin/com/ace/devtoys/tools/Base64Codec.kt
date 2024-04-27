package com.ace.devtoys.tools

import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi


object Base64Codec {
    @OptIn(ExperimentalEncodingApi::class)
    fun decode(base64: String): String {
        val decode: ByteArray = Base64.decode(base64)

        return String(decode, Charsets.UTF_8)
    }

    @OptIn(ExperimentalEncodingApi::class)
    fun encode(text: String): String {
        return Base64.encode(text.encodeToByteArray())
    }
}
