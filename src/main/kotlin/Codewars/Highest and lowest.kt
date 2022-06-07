package Codewars

/*
In this little assignment you are given a string of space separated numbers,
and have to return the highest and lowest number.
 */

fun highAndLowSolution1(numbers: String): String {
    val numbersSplit = numbers.split(" ").map { it.toInt() }.toMutableList()
    val numSorted = numbersSplit.sorted().reversed()
    val low = numSorted.first().toString()
    val high = numSorted.last().toString()

    return "$low $high"
}

fun highAndLowSolution2(numbers: String): String {
    val num = numbers.split(" ").map { it.toInt() }.toMutableList().sorted()
    return "${num.last()} ${num.first()}"
}

fun highAndLowSolution3(numbers: String): String {
    val num = numbers.split(" ").map { it.toInt() }.sorted()
    return "${num.last()} ${num.first()}"
}
