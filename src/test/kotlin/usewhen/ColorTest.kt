package usewhen

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ColorTest {
    @Test
    internal fun `deve retornar valor rbg em decimais das cores`() {
        assertEquals(65280, Color.GREEN.rgb())
        assertEquals(16753920, Color.ORANGE.rgb())
        assertEquals(16776960, Color.YELLOW.rgb())
        assertEquals(255, Color.BLUE.rgb())
        assertEquals(4915330, Color.INDIGO.rgb())
        assertEquals(15631086, Color.VIOLET.rgb())
    }

}