package br.com.aprendendo.usesetget

/**
 * Kotlin
 * Ao invés de chamar o getter, você referenciará a propriedade diretamente.
 */
class Carro (
    val quantidadePneus: Int,
    val quantidadeJanelas: Int,
    val cor: String
){

    /**
     * Declarando um getter customizado com a expressão
     */
    val totalJanelas get() = quantidadeJanelas

    /**
     * Declarando um getter customizado a usar bloco de código.
     */
    val totalJanelasComPortamala:Int get() {
      return quantidadeJanelas + 1
    }


}