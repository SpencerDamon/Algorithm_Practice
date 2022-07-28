package HyperSkill_Kotlin_Basics

/*
Handle arithmetic exception
Write a program that calculates the division of two input numbers. It may throw an ArithmeticException.
Fix it to avoid the exception.

In the case when the exception can happen, the corrected program should output: Division by zero,
please fix the second argument!.

Sample Input:
8
2

Sample Output:
4


Sample Input:
8
0

Sample Output:
Division by zero, please fix the second argument!
 */

fun main() {
    val (int1, int2) = List(2) { readln().toInt() }
    try {
        println(int1 / int2)
    } catch (e: ArithmeticException) {
        println("Division by zero, please fix the second argument!")
    }
}

/*
fun main() {
    val (int1, int2) = List(2) { readln().toInt() }
    if (int2 != 0) {
        println(int1 / int2)
    } else { println("Division by zero, please fix the second argument!")
    }
}
 */