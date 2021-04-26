package study.playground.intro.classes

class Customer //프로퍼티 없는 클래스 선언 

class Contact(val id: Int, var email : String) //id 와 이메일을 프로퍼티로 받는 클래스 선언

fun main() {
    val customer = Customer() //new 키워드 없이 객체 생성 
    val contact = Contact(1, "kim@mail.com") //기본 생성자가 아닌 두개의 프로퍼티 파라미터로 받는 생성자

    println(contact.id) //Contact 프로퍼티인 id에 접근

    contact.email = "lee@mail.com" //email 프로퍼티 업데이트
}