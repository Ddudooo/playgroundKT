package study.playground.control.loops

class Animal(val name: String)

class Zoo(val animals: List<Animal>) {

    operator fun iterator(): Iterator<Animal> {
        return animals.iterator()
    }
}

fun main() {

    val zoo = Zoo(listOf(Animal("얼룩말"), Animal("사자")))

    for (animal in zoo) {
        println("저것봐 ${animal.name}야")
    }

}