package usewhen

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class ColorMnemonicTest {
    @Test
    internal fun `deve retornar mnemonic de cada cor`() {
        val colorMnemonic = ColorMnemonic()
        assertEquals("Richard", colorMnemonic.getMnemonic(Color.RED))
        assertEquals("Of", colorMnemonic.getMnemonic(Color.ORANGE))
        assertEquals("Vain", colorMnemonic.getMnemonic(Color.VIOLET))
    }

    @Test
    internal fun `deve retornar mnemonic de cada cor 2`() {
        val colorMnemonic = ColorMnemonic()
        assertEquals("Richard", colorMnemonic.getMnemonic2(Color.RED))
        assertEquals("Of", colorMnemonic.getMnemonic2(Color.ORANGE))
        assertEquals("Vain", colorMnemonic.getMnemonic2(Color.VIOLET))
    }

    @Test
    internal fun `deve retornar a mistura entre as cores`() {
        val colorMnemonic = ColorMnemonic()
        assertEquals(Color.ORANGE, colorMnemonic.mix(Color.RED, Color.YELLOW))
        assertEquals(Color.RED, colorMnemonic.mix(Color.ORANGE, Color.YELLOW))

    }

    @Test
    internal fun `deve retornar a mistura entre as cores usando o otimizado`() {
        val colorMnemonic = ColorMnemonic()
        assertEquals(Color.ORANGE, colorMnemonic.mixOptimized(Color.RED, Color.YELLOW))
        assertEquals(Color.RED, colorMnemonic.mixOptimized(Color.ORANGE, Color.YELLOW))

    }
}