package HyperSkill_Kotlin_Basics

/*
Elvis throwing exceptions
Try to read a line. If there is no line, throw an IllegalStateException(). If there is a line, output Elvis says: $line.

Use the ?: throw construction to solve this task.


Sample Input:
hairstyle

Sample Output:
Elvis says: hairstyle
 */

fun main() {
    println("Elvis says: ${readLine() ?: error("IllegalStateException")}")
}