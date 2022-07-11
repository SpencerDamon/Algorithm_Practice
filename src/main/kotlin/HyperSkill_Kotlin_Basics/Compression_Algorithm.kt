package HyperSkill_Kotlin_Basics

/*
Compression algorithm
Upon learning that DNA is not a random string, freshmen of the Bioinformatics Institute from the
informatics group suggested using a compression algorithm that compresses repeated characters in a string.

Encoding is performed as follows:
The string "aaaabbсaa" is converted into "a4b2с1a2", that is, the groups of the same characters of the
input string are replaced by the symbol and the number of its repetitions in this string.

Write a program, which reads the string, encodes it by this algorithm and outputs the encoded sequence.
The encoding must be case sensitive.

Note, string can be empty or contain only a single character.


Sample Input:
aaaabbcaa

Sample Output:
a4b2c1a2


Sample Input:
abc

Sample Output:
a1b1c1


Sample Input:
aaaaa

Sample Output:
a5
 */


fun main() {
    val input = readln()
    val lastChar = input[input.lastIndex]
    var charCounter = 1
    var tallyString = ""
    var builderString: String

    for (i in 1 until input.length) {
        if (input[i - 1] == input[i]) {
            ++charCounter
        } else {
            builderString = "${input[i - 1]}$charCounter"
            charCounter = 1
            tallyString += builderString
        }
    }

    println("$tallyString$lastChar$charCounter")
}