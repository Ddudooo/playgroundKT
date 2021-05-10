package study.playground.collections

const val POINTS_X_PASS: Int = 15
//가변 맵 선언 및 초기화
val EZPassAccounts: MutableMap<Int, Int> = mutableMapOf(1 to 100, 2 to 100, 3 to 100)
// 가변 맵 기반으로 불변 맵 캐스팅
val EZPassReport: Map<Int, Int> = EZPassAccounts

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) { //맵에 키가 있는 지 확인
        println("Updating $accountId...")
        //키로 값 변경
        EZPassAccounts[accountId] = EZPassAccounts.getValue(accountId) + POINTS_X_PASS
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {// 반복문을 통한 Key / Value 출력
            k, v -> println("ID $k: credit $v")
    }
}

fun main() {
    accountsReport()
    updatePointsCredit(1)
    updatePointsCredit(1)
    updatePointsCredit(5)
    accountsReport()
}