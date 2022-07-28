package HyperSkill_Kotlin_Basics

/*
equals() check
Write a program that reads six values (name, age, balance, name, age, balance) and uses
all of them as fields of a data class, that is, Client.

Change this given data class in order to check two different clients disregarding their balances.
It means that two clients are equal if they have the same name and age. Print the result as true or false.


Sample Input:
John
19
0
John
19
22

Sample Output:
true

 */

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }
}

fun main() {
    // Named parameters for readability
    val client1 = Client(name = readln(), age = readln().toInt(), balance = readln().toInt())
    val client2 = Client(name = readln(), age = readln().toInt(), balance = readln().toInt())
    println(client1.equals(client2))
}