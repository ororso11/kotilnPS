// 코틀린에서의 조건문 -> 자바와 동일하다.
// Statment: 프로그램의 문장, 하나의 값으로 도출되지않는다.
// Expression: 하나의 값으로 무조건 -> 코틀린은 if문을 리턴을 할수있음!
// 코틀린은 삼항연산자는 없음
// switch와 when

fun validateScoreIsNotNegative(score: Int) {
    if( score in 0..100 ) {
        val vass = score
    }
}
fun getPassOrFail(score: Int): String {
    return if( score >= 50 ) {
         "P"
    } else {
         "F"
    }
}

// switch -> when : 하나의 expression
fun getGradeWithSwitch(score: Int): String {
    return when ( score / 10 ) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean{
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// 다중 조건문
fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("어디서 많이 본 숫자입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어지는 숫자는 홀수 입니다")
    }
}

fun main() {
    println(getGradeWithSwitch(2))
}