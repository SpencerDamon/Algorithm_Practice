package HyperSkill_Kotlin_Basics

/*
Banana!
You are given a MutableList of strings and a String in the input. Replace the occurrences of the given String in the MutableList with Banana.


Sample Input:
Sometimes you have to shake up your life
shake

Sample Output:
Sometimes you have to Banana up your life
*/
fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    for (i in strings.indices) {
        if (strings[i] == str) strings[i] = "Banana"
    }
    return strings
}

/*
Others Solutions
Volodymyr

 fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    val a = strings
    for (i in a.indices) {
        if (a[i] == str) {
            a.set(i, "Banana")

        }
    }
    return a
}


Denis Sergeevich

fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    val b = "Banana"
    for ((i, x) in strings.withIndex()) {
        if (x == str) {
            strings[i] = b
        } else continue
    }
    return strings
}

undefcat

fun solution(strings: MutableList<String>, str: String): MutableList<String> {
    strings.forEachIndexed { i, s ->
        if (s == str) {
            strings[i] = "Banana"
        }

    }

    return strings


Ahmed
fun solution(strings: MutableList<String>, str: String) = strings
    .map { if (it == str) "Banana" else it }
    .toMutableList()

 */