package useforintervals

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ForIntervalsTest {
    @Test
    internal fun `deve imprimir uma laco de 1 a 10`() {
        val interador = ForIntervals()
        interador.forWithInterval()
        assertTrue(true)
    }

    @Test
    internal fun `deve imprimir um laco de 10 a 1 em passos de 2 em 2 (pares)`() {
        val interador = ForIntervals()
        interador.forWithIntervalAndStepsTwo()
        assertTrue(true)
    }

    @Test
    internal fun `deve imprimir um laco de A a F`() {
        val interador = ForIntervals()
        interador.forWithCaracters()
        assertTrue(true)
    }
}
