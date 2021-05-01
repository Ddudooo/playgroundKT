package study.playground.`class`.data

data class User(val name: String, val id: Int)

fun main(){
    val user = User("홍길동", 1)
    println(user)

    val secondUser = User("홍길동",1 )
    val thirdUser = User("김서방",2)

    println("user == secondUser : ${user == secondUser}")
    println("user == thirdUser : ${user == thirdUser}")

    println(user.hashCode())
    println(secondUser.hashCode())

    println(user.copy())
    println(user.copy("김서방"))
    println(user.copy(id = 2))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
    
}