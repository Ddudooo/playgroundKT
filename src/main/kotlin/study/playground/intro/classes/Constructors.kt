package study.playground.intro.classes

fun main(){
    class InitOrderDemo(name: String){
        val firstProperty = "First Property : $name".also(::println)

        init {
            println("First initializer block that prints ${name}")
        }

        val secondProperty = "Second property: ${name.length}".also(::println)

        init {
            println("Second initializer block that prints ${name.length}")
        }
    }

    val demo = InitOrderDemo("테스트!")
}