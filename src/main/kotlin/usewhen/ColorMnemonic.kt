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
}