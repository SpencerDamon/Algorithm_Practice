package HyperSkill_Kotlin_Basics

/*
Area of a circle
Write a program that reads a radius R and calculates the area of a circle with a given radius.

Use this formula: S=πR2.

Where S – an area of a circle, π is 3.1415, and R – the radius of the circle.

Input: one number of type Int.

Output: one real number.

Do not format or round your result. Use the given value of π.

Sample Input:
25

Sample Output:
1963.4375
 */

import kotlin.math.pow

fun main() = println(3.1415*readln().toDouble().pow(2))

//val areaOfCircle = 3.1415*readln().toDouble().pow(2)
//println(areaOfCircle)