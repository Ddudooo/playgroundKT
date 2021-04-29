package study.playground.intro.inheritance

open class Tiger(val origin: String) {
    fun sayHello() {
        println("$origin 호랑이가 울부짖었다 그르르르!")
    }
}

class SiberianTiger : Tiger("시베리아") //하위 클래스 만들시, 파라미터를 사용한 생성자 사용

open class Dragon(val prefix : String){
    fun say(){
        println("$prefix(이)가 울부 짖었따.")
    }
}

class InvisibleDragon : Dragon("짱쎈 투명드래곤")

fun main() {
    val tiger: Tiger = SiberianTiger()
    tiger.sayHello()

    val dragon : Dragon = InvisibleDragon()
    dragon.say()
}