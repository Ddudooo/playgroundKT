package study.playground.intro.functions

fun main(){
    fun printAll(vararg messages: String) {
        for (m in messages) println(m)
    }
    printAll("안녕?", "하이!", "여러개", "파라미터", "가변적으로")

    //함수 호출시 파라미터 명명으로 인해, 다른 매개변수 유형으로도 가능
    //자바의 경우는 불가능함.
    fun printAllWithPrefix(vararg messages: String, prefix: String) {
        for (m in messages) println(prefix + m)
    }

    printAllWithPrefix(
        "안녕?", "하이!", "여러개", "파라미터", "가변적으로",
        prefix = "[출력] " //파라미터 명칭으로 사용
    )

    fun log(vararg entries: String) {
        printAll(*entries)
    }

    log("안녕?", "하이!", "여러개", "파라미터", "가변적으로")
}