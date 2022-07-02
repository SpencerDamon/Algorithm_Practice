package HyperSkill_Kotlin_Basics

/*
Write an implementation of a function named getLength that returns the length of a String,o
r -1 if the string is null.
 */

fun getLength(input: String?): Int {
    return input?.length ?: -1

}

// or

fun getLength(input: String?): Int {
    return if (input == null) -1 else input.toString().length
}
