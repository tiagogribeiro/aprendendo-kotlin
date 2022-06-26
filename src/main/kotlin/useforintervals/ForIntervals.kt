package useforintervals

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
}