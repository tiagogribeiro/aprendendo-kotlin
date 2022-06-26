package setget

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CarroTest {

    @Test
    internal fun `deve retornar valores das propriedade`() {

        val carro = Carro(4, 4, "cor")

        assertEquals(4, carro.quantidadeJanelas)
        assertEquals(4, carro.quantidadeJanelas)
        assertEquals(4, carro.totalJanelas)
        assertEquals(5, carro.totalJanelasComPortamala)
        assertEquals("cor", carro.cor)
    }
}