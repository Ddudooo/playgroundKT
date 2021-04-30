package study.playground.control.equality

fun main(){
    val authors = setOf("세익스피어", "해밍웨이", "트웨인")
    val writers = setOf("트웨인", "세익스피어", "해밍웨이")

    println(authors == writers) // 값비교
    println(authors === writers) //주소값 비교
}