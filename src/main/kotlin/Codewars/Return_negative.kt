package Codewars

/*
In this simple assignment you are given a number and have to make it negative.
But maybe the number is already negative?
 */

fun makeNegativeSolution1(x: Int): Int {
    // returns negative x
    if (x > 0) return x * -1 else return x
}


fun makeNegativeSolution2(x: Int) = -kotlin.math.abs(x)

fun makeNegativeSolution3(x: Int) = if (x <= 0) x else -x


