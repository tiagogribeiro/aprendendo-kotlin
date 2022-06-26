package br.com.aprendendo.useforintervals

class ForIntervals {

    fun forWithInterval() {
        for (a in 1..10){
            println(a)
        }
    }

    fun forWithIntervalAndStepsTwo() {
        for (a in 10 downTo 1 step 2){
            println(a)
        }
    }

    fun forWithCaracters() {
        for (a in 'A'..'F'){
            println(a)
        }
    }

    fun forItethanisingAMap() {
        val list = arrayListOf("10", "11", "12")
        for ((index, element) in list.withIndex()){
            println("$index: $element")
        }
    }

}