package study.playground.control.conditional

fun main(){
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))
}