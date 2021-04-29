package study.playground.intro.inheritance

open class Dog {// 상속을 허용하는 클래스 선언을 위해 `open` 키워드 추가
    open fun sayHello() {// 함수 역시 클래스와 동일하게 상속을 허용할 경우 `open` 키워드 작성
        println("wow wow!")
    }
}

class Yorkshire : Dog() {// `Dog`를 상속 받는 클래스, 빈괄호의 경우 기본 생성자 호출 표시
    override fun sayHello() {//함수 재정의로 키워드 `override` 필요
        println("wif wif!")
    }
}

fun main() {
    val dog: Dog = Yorkshire()
    dog.sayHello()
}