package HyperSkill_Kotlin_Basics

/*
Write an implementation of a function named isNumber that determines if String can be converted to Int.
If it can, then return its Int value, otherwise return the same String.

You can use String function .toIntOrNull()

Sample Input 1:

1
Sample Output 1:

1
 */

fun main() {

    fun isNumber(input: String): Any = input.toIntOrNull() ?: input

    print(isNumber("Is a String, not an Int"))
    //print(isNumber("1"))


}