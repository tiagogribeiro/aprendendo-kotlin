package usersmartcast

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CalculatorTest {

    @Test
    internal fun `deve retornar resultado do numero adicionado ao calculadora`() {
        val calculator = Calculator()
        assertEquals(1, calculator.calculate(Num(1)))
    }

    @Test
    internal fun `deve retornar resultado do numero adicionado ao calculadora (when)`() {
        val calculator = Calculator()
        assertEquals(1, calculator.calculateExpression(Num(1)))
    }

    @Test
    internal fun `deve retornar a soma de dois numero`() {
        val calculator = Calculator()
        assertEquals(2, calculator.calculate(Sum(Num(1), Num(1))))
    }

    @Test
    internal fun `deve retornar a soma de dois numero (when)`() {
        val calculator = Calculator()
        assertEquals(2, calculator.calculateExpression(Sum(Num(1), Num(1))))
    }
}
