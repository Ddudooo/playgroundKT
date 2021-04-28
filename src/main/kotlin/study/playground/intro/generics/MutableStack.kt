package study.playground.intro.generics

class MutableStack<E>(vararg items: E) {//클래스 선언

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)//매개 변수로 사용가능

    fun peek(): E = elements.last()//반환타입으로도 가능

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}