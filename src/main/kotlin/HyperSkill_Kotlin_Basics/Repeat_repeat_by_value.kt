package HyperSkill_Kotlin_Basics

/*
Repeat by value
Write a program that reads a number and prints it the number of times corresponding to the value of the input number.


Sample Input:
5

Sample Output:
55555

 */

fun main() {
    val input = readln()
    print(input.repeat(input.toInt()))
}
