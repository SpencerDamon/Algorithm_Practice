package HyperSkill_Kotlin_Basics

/*
Parse url
You want to hack a website and get all available parameters. Print them "key : value".
If a parameter doesn't have value, print "not found".

If you find the password (parameter pass), you should print its value after all parameters once again,
but with a key password. If a URL does not contain a parameter pass,
do not print anything after parameters. But if the pass parameter is present, its value cannot be empty

Note: the order of parameters should be like as in the URL.
Advice: learn the structure of URL.


Sample Input:
https://target.com/index.html?pass=12345&port=8080&cookie=&host=localhost

Sample Output:
pass : 12345
port : 8080
cookie : not found
host : localhost
password : 12345


Sample Input:
https://target.com/index.html?port=8080&cookie=&host=localhost

Sample Output:
port : 8080
cookie : not found
host : localhost

 */

fun main() {
    val urlQueryParameters = readln().substringAfter("?").split("&").toMutableList()

    for (parameter in urlQueryParameters) {
        print("${parameter.substringBefore("=")} : ")
        if (parameter.substringAfter("=").isEmpty()) println("not found") else println(parameter.substringAfter("="))
    }

    for (parameter in urlQueryParameters) {
        if (parameter.substringBefore("=").contains("pass")) println("password : ${parameter.substringAfter("=")}")
    }
}


/*
// Solution by Tatiana Anisimova https://hyperskill.org/profile/251138891
fun main() {
    val par = readln().substringAfter('?').replace("=&", "=not found&").split('=').joinToString(" : ")
    println(par.replace("&", "\n"))

    if (par.contains("pass")) {
        val password = par.substringAfter("pass : ")
        println("password : ${password.substringBefore('&')}")
    }
}

 */