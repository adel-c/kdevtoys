package com.ace.devtoys.tools

object JwtDecoder {

    fun decodePayload(token: String): String {
        val split = token.split('.')
        if (split.size != 3) {
            return "";
        }
        return Base64Codec.decode(split[1])
    }
}

