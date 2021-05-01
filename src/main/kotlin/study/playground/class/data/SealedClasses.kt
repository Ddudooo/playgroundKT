package study.playground.`class`.data

sealed class Mammal(val name: String)

class Cat(val catName: String) : Mammal(catName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "안녕 ${mammal.name} 너의 일은 ${mammal.job} "
        is Cat -> return "안녕 ${mammal.name}"
    }
}

fun main() {
    println(greetMammal(Cat("검은 질풍 3세 주니어")))
    println(greetMammal(Human("홍길동", "의적")))
}