package com.ace.devtoys.tools

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class Base64CodecTest {

    @Test
    fun decode() {
        assertEquals("A random string",  Base64Codec.decode("QSByYW5kb20gc3RyaW5n"))
    }

    @Test
    fun encode() {
        assertEquals("QSByYW5kb20gc3RyaW5n",Base64Codec.encode("A random string"))
    }

    @Test
    fun decode_empty() {
        assertEquals("",  Base64Codec.decode(""))
    }
}
