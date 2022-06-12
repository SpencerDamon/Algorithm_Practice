package HyperSkill_Kotlin_Basics
/*
Number of occurrences
Write a program that finds the frequency of occurrences of substring in given string.


Input data format

The first input line contains a string, the second one contains a substring.


Sample Input:
hello there
the

Sample Output:
1
*/

fun main() {
    // First Attempt - Readability
    val input1 = readln()
    val target1 = readln()
    val occurrences1 = input1.split(target1).toMutableList()
    println(occurrences1.lastIndex)

    // Second Attempt - Density
/*fun main() = */ println(readln().split(readln()).lastIndex)
}

/*
Get input
Split the input with the target to a new list
Return the last index of the new list
 */