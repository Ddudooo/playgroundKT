# 코틀린 공부 

공식 문서와 제공되는 [Playground](https://play.kotlinlang.org/byExample/overview) 에서 기반 공부

## 공부 내용 정리

공식 문서 및 플레이그라운드 내용 기반으로 작성

### 기본적인 문법

자바와 매우 유사함

#### 패키지와 import 구문

```kotlin
package study.kotlin

import kotlin.text.*
// ...
```
`디렉토리`와 `패키지`를 일치시키지 않아도 되며  
소스 파일은 파일 시스템에 임의로 배치 할 수 있음.

#### 프로그램 진입점
[소스 예제](src/main/kotlin/study/playground/intro/hello_world/HelloKT.kt)

코틀린 어플리케이션의 진입점은 `main` 함수.
```kotlin
fun main() {
    println("코틀린 공부!")
}
```

```kotlin
fun main(args: Array<String>) {
    //`main` 함수의 다른 양식으로 `String`타입의 파라미터를 받는 방식!
    println(args.contentToString())
}
```

#### 표준 출력

`print` 함수는 파라미터를 표준 출력한다.
```kotlin
print("Hello ")
print("world!")
```

`println` 함수는 파라미터와 그 끝에 줄바꿈을 추가한다.  
그 결과론 출력된 다음 항목이 다음 줄에 나타나게 된다.

```kotlin
println("Hello world!")
println(42)
```

#### 함수
[소스](src/main/kotlin/study/playground/intro/functions/Functions.kt)

두개의 `Int`타입 파라미터를 받아 `Int` 를 반환하는 간단한 함수.
```kotlin
fun sum(a: Int, b: Int): Int {
    return a + b
}
```

함수 본체는 표현식으로 작성가능하며, 반환 타입은 유추되는 형태.  

> 코틀린의 타입은 컴파일시 자바의 `primitive` 혹은 `wrapper` 타입으로 자동 변환

```kotlin
fun sum(a: Int, b: Int) = a + b
```

의미있는 값을 반환하지 않는 함수의 예시
```kotlin
fun printSum(a: Int, b: Int): Unit {
    println("sum of $a and $b is ${a + b}")
}
```

`Unit` 타입의 경우 반환유형에서 생략할 수 있음.
```kotlin
fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}
```

##### `infix` 함수
[소스](src/main/kotlin/study/playground/intro/functions/InfixFunctions.kt)

__표기법__

`infix` 키워드로 표시된 함수는  
인픽스 표기(호출의 점이나 괄호를 생략)를 사용하여 호출할 수도 있음.

`Infix` 함수는 다음을 충족해야함
* `멤버 함수` 또는 `확장 함수`
* 하나의 파라미터만을 가져야함.
* 파라미터는 가변 개수의 인수를 허용하지 않아야하며 기본값이 없어야함.

```kotlin
infix fun Int.shl(x: Int): Int { /*...*/ }

// . () 생략하는 호출식
1 shl 2

// 위와 같은 방식이나 생략 안함
1.shl(2)
```

##### Operator Functions

`operators` 들은 오버라이딩이 가능.

```kotlin
operator fun Int.times(str: String) = str.repeat(this)
println(2 * "안녕! ") // Int * -> times 표준 함수                                          

operator fun String.get(range: IntRange) = substring(range)
val str = "매우 긴 문자열로 테스트해보자, 테스트용 문자열!"
println(str[0..14]) // String [?] -> String 표준 함수              
```

##### 가변 파라미터 사용 함수

함수 선언시 파라미터 앞에 `varargs` 붙여서 선언시  
가변적으로 파라미터를 받을 수 있음

```kotlin
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

val list = asList(1,2,3);
```

