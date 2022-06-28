package HyperSkill_Kotlin_Basics

/*
Write a program that prints the following shape:

#
##
###
####
#####
######
 */
/*
const val ONE = 1
const val SIX = 6
fun main() {
    (ONE..SIX).forEach { i ->
        repeat(i) {
            print("#")
        }
        println()
    }
}
*/

const val SIX = 6
fun main() {
    for (i in ONE..SIX) {
        repeat(i) {
            print("#")
        }
        println()
    }
}
