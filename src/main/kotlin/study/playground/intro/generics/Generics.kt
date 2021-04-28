package study.playground.intro.generics

fun <E> mutableStackOf(vararg elements: E) = MutableStack(*elements)

fun main() {
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    val stack2 = mutableStackOf("가","나","다")
    println(stack2)
}