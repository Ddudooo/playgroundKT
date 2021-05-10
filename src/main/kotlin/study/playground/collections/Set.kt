package study.playground.collections

// 가변 셋 선언과 초기화
val openIssues: MutableSet<String> = mutableSetOf("유니크1", "유니크2", "유니크3")


fun addIssue(uniqueDesc: String): Boolean {
    return openIssues.add(uniqueDesc) //요소가 실질적으로 추가되었는 확인되는 boolean 값
}

fun getStatusLog(isAdded: Boolean): String {
    return if (isAdded) "제대로 추가됨." else "중복값이거나 거절됨."
}

fun main() {
    val aNewIssue: String = "유니크4"
    val anIssueAlreadyIn: String = "유니크2"

    println("이슈 $aNewIssue ${getStatusLog(addIssue(aNewIssue))}")
    println("이슈 $anIssueAlreadyIn ${getStatusLog(addIssue(anIssueAlreadyIn))}")
}