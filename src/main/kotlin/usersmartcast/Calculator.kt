package usersmartcast

import java.lang.IllegalArgumentException

class Calculator {

    /**
     * O tipo da variável é determinada pelo is anterior ao retorno.
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

}