package study.playground.intro.hello_world

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y //인라인 함수 작성

fun main() {
    printMessage("안녕")
    printMessageWithPrefix("안녕", "LOG")
    printMessageWithPrefix("함수에 기본값 입력!")
    printMessageWithPrefix(prefix = "파리미터", message = "직접 선언")
    println(sum(1,2)) //함수 결과값을 출력
    println(multiply(2,4))
}