package HyperSkill_Kotlin_Basics

/*
Not in range

Read an Int number. Write a program that prints false if this number is between 1 and 10 (inclusive),
and true otherwise.

Sample Input:
5

Sample Output:
false


Sample Input:
0

Sample Output:
true

 */

const val ONE = 1
const val TEN = 10
fun main() = print(readln().toInt() !in ONE..TEN)
