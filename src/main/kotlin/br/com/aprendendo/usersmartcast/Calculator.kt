package br.com.aprendendo.usersmartcast

import java.lang.IllegalArgumentException

class Calculator {

    /**
     * O tipo da variável é determinada pelo is anterior ao retorno.
     *
     * Dentro do bloco do if, o expr o compilador já saber que é do tipo Num ou Sum.
     */
    fun calculate(expr: Expression): Int {

        if (expr is Num){
            return expr.value
        }

        if (expr is Sum){
            return calculate(expr.left) + calculate(expr.right)
        }

        throw IllegalArgumentException("Unknow expression")
    }


    fun calculateExpression(expr: Expression) = when(expr) {
        is Num -> expr.value
        is Sum -> calculate(expr.left) + calculate(expr.right)
        else -> throw IllegalArgumentException("Unknow expression")
    }

}