package br.com.aprendendo.usewhen

/**
 * Observar que no Kotlin é preciso colocar "class" na frente da enum. (Caso raro que foi adicionado
 * uma palavra reservada), e deve usar ";" no final das declarações de constants.
 *
 * Notas que entre parênteses são propriedaes da enum.
 */
enum class Color(
    val r: Int,
    val g: Int,
    val b: Int
) {
    RED(255,0,0),
    ORANGE(255,165,0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b


}