package study.playground.control.`when`

fun main() {
    cases("안녕?")
    cases(1)
    cases(0L)
    cases(ExampleClass())
    cases("하이")
}

fun cases(obj: Any) {
    //코틀린에서의 `when` 구문
    when (obj) {
        1 -> println("하나") //1 과 동일한지
        "안녕?" -> println("안녕!") // 문자열과 동일한지
        is Long -> println("$obj 는 Long 타입.") //타입이 같은지
        !is String -> println("$obj 는 String 이 아님.") //타입이 다른지
        else -> println("아몰랑") //디폴트
    }
}

class ExampleClass