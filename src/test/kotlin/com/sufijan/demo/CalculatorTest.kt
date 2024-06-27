package com.sufijan.demo

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculatorTest {
    @Test
    fun MultiplyBy() {
        val calculator = Calculator()
        val result = calculator.parse("4 * 3")
        assertEquals( 12, result)
    }

    @Test
    fun Divideby() {
        val calculator = Calculator()
        val result = calculator.parse("4 / 2")
        assertEquals(2, result)
    }
}