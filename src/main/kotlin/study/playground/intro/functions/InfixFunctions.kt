package study.playground.intro.functions

fun main() {

    //Int 타입으로 Infix 함수 표현식 선언
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "안녕! ")

    //표준 라이브러리의 `to` Infix 함수
    val pair = "페라리" to "카타리나"
    println(pair)

    //String 타입으로 `Pair` 호출하는 `infix` 함수
    infix fun String.onto(other: String) = Pair(this, other)
    val myPair = "맥라랜" onto "루카스"
    println(myPair)

    val gildong = Person("홍길동")
    val kim = Person("김서방")
    gildong likes kim
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    //클래스 파라미터에서의 `infix` 함수 선언
    infix fun likes(other: Person) { likedPeople.add(other) }
}