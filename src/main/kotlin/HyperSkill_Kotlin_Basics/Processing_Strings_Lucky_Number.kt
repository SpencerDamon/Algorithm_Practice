package HyperSkill_Kotlin_Basics
//Lucky number
//Given the number N with an even number of digits. If the sum of the first half of the digits
// equals the sum of the second half of the digits, then this number is considered lucky.
// For a given number, output "YES" if this number is lucky, otherwise output "NO".
//
//
//Sample Input:
//12344321
//
//Sample Output:
//YES
//
//
//Sample Input:
//125322
//
//Sample Output:
//NO

fun main() {
    //    val inputList = readln()
//    val n = inputList.length / 2
//    val firstHalf = inputList.substring(0, n)
//    val secondHalf = inputList.substring(n, inputList.length) // If use .lastIndex the last element is omitted
//    var sum1 = 0
//    var sum2 = 0
//    for (i in firstHalf) {
//        sum1 += i.digitToInt()
//    }
//    for (j in secondHalf) {
//        sum2 += j.digitToInt()
//    }
//
//    if (sum1 == sum2) println("YES") else println("NO")

    // OR

    val inputList = readln().map { it.toString().toInt()}
    val firstHalf = inputList.subList(0, inputList.size / 2).sum()
    val secondHalf = inputList.subList(inputList.size / 2, inputList.size).sum()
    println(if (firstHalf == secondHalf) "YES" else "NO")
}