package usein

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class UseInTest {
    @Test
    internal fun `deve retornar como existente a letra g`() {
        val useIn = UseIn()
        assertTrue(useIn.exists('g'))
    }

    @Test
    internal fun `deve retornar como existente a letra G (key sensitive)`() {
        val useIn = UseIn()
        assertTrue(useIn.existsKeySensitive('G'))
    }

    @Test
    internal fun `deve retorna falso pois a letra z nao esta no range`() {
        val useIn = UseIn()
        assertTrue(useIn.notExists('z'))
    }

    @Test
    internal fun `deve retorna true pois a letra a esta no range`() {
        val useIn = UseIn()
        assertFalse(useIn.notExists('a'))
    }
}