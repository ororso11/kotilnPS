import java.util.*

// for each문
// 향상된 for문 공부

fun main() {
    val n = 10
    var answer: IntArray = intArrayOf()
    var aa = IntArray(n)
    for(i in 1..n step 2) {
        aa.plus(i)
        println("size : ${aa.get(i - 1)}")
    }
}