package usewhen

class ColorMnemonic {

    /**
     * Observer que é usado "->" para atribuir o bloco de código ou expressão.
     * Block-code
     */
    fun getMnemonic(color: Color): String {
        return when(color){
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
        }
    }

    /**
     * Expression
     */
    fun getMnemonic2(color: Color) = when(color){
            Color.RED -> "Richard"
            Color.ORANGE -> "Of"
            Color.YELLOW -> "York"
            Color.GREEN -> "Gave"
            Color.BLUE -> "Battle"
            Color.INDIGO -> "In"
            Color.VIOLET -> "Vain"
    }

    /**
     * when também aceita objetos, no exemplo um lista (Set).
     */
    fun mix(corUm: Color, corDois: Color): Color {
        return when(setOf(corUm, corDois)){
            setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
            setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
            else -> {Color.RED}
        }
    }

    /**
     * When sem argumentos.
     */
    fun mixOptimized(corUm: Color, corDois: Color): Color {
        return when{
            (corUm == Color.RED && corDois == Color.YELLOW) -> Color.ORANGE
            (corUm == Color.YELLOW && corDois == Color.BLUE) -> Color.GREEN
            else -> {Color.RED}
        }
    }
}