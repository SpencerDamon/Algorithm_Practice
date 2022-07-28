package HyperSkill_Kotlin_Basics

/*
copy() usage
Write a program that reads four numbers (height, twice length, width) and uses all of them as
fields of a data class which is Box.

Use copy() function in order to create a second box with a different length value (from input).
As a result, there must be two boxes. Print them both.


Sample Input:
3
4
1
9

Sample Output:
Box(height=3, length=4, width=9)
Box(height=3, length=1, width=9)
 */

/* Solution 1
data class Box(val height: Int, val length: Int, val width: Int) {
    override fun toString(): String {
        return "Box(height=$height, length=$length, width=$width)"
    }
}

fun main() {
    val heightInput = readln().toInt()
    val length1Input = readln().toInt()
    val length2Input = readln().toInt()
    val widthInput = readln().toInt()

    val box1 = Box(heightInput, length1Input, widthInput)
    val box2 = box1.copy(length = length2Input)

    println(box1)
    println(box2)

}

 */

// Solution 2
data class Box(val height: Int, val length: Int, val width: Int)

fun main() {
    val heightInput = readln().toInt()
    val length1Input = readln().toInt()
    val length2Input = readln().toInt()
    val widthInput = readln().toInt()

    val box1 = Box(heightInput, length1Input, widthInput)
    val box2 = box1.copy(length = length2Input)

    println(box1)
    println(box2)
}


/* Solution 3
data class Box(val height: Int, val length: Int, val width: Int)

const val LIST_SIZE = 4
fun main() {
    val dimensions = List(LIST_SIZE) { readln().toInt() }

    val box1 = Box(dimensions[0], dimensions[1], dimensions[3])
    val box2 = box1.copy(length = dimensions[2])

    println(box1)
    println(box2)

}
 */

