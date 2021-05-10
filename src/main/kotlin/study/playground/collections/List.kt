package study.playground.collections

val systemUsers: MutableList<Int> = mutableListOf(1, 2, 3) // 가변 리스트 생성과 초기화
val sudoers: List<Int> = systemUsers                       // 불변 리스트로 캐스팅과 초기화

fun addSystemUser(newUser: Int) {                          // 가변 리스트 목록 추가 함수
    systemUsers.add(newUser)
}

fun getSysSudoers(): List<Int> {                           // 불변 리스트 반환 함수
    return sudoers
}

fun main() {
    addSystemUser(4)                             // 가변 리스트 목록 추가
    println("Tot sudoers: ${getSysSudoers().size}")        // 불변 리스트로 조회
    getSysSudoers().forEach {
            i -> println("Some useful info on user $i")
    }
    // 불변 리스트로 조회시 해당 리스트 추가시 오류 발생
    // getSysSudoers().add(5) <- Error!
}