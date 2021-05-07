package study.playground.functional

fun calculate(x : Int, y : Int, operation: (Int, Int) -> Int) : Int {
    return operation(x, y)
}

fun sum(x:Int, y: Int) = x+y

fun singleCalc(): (Int) -> Int {
    return ::sqare
}

fun sqare(x :Int)  = x * x

fun main(){
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4,5 ) { a, b -> a * b }
    println("Sum RESULT $sumResult, Mul RESULT $mulResult")
}