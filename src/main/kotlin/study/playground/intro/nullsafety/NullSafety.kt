package study.playground.intro.nullsafety

fun main(){
    var neverNull: String = "이 변수는 null이 될 수 없음."

    //neverNull = null //컴파일러에서 오류

    var nullable: String? = "이 변수는 nullable로 선언함"

    nullable = null //이 경우에는 허용

    var inferredNonNull = "타입 미선언시에도 기본적으로 null이 될 수 없음"

    //inferredNonNull = null//컴파일러에서 오류 발생

    fun strLength(notNull: String): Int { //null 이 아닌 파라미터를 받는 함수
        return notNull.length
    }

    strLength(neverNull)
    //strLength(nullable) //함수를 통해 호출하더라도 컴파일러에서 오류 발생

    //코틀린에서의 nullable 변수 처리 예시
    fun describeString(maybeString: String?): String {
        if (maybeString != null && maybeString.length > 0) {
            return "String of length ${maybeString.length}"
        } else {
            return "Empty or null string"
        }
    }
}