package study.playground.intro.functions

fun main(){
    operator fun Int.times(str: String) = str.repeat(this)
    println(2 * "안녕! ")

    operator fun String.get(range: IntRange) = substring(range)
    val str = "매우 긴 문자열로 테스트해보자, 테스트용 문자열!"
    println(str[0..14])
}