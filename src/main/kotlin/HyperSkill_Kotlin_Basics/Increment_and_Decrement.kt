package HyperSkill_Kotlin_Basics

/*
Consider the following code:

var a = 1
println(a++ * a)
What would be the result? = 2

Postfix means that the value gets added only after the variable has been used. In this case, the variable
is being used for the first time when it is being printed. Thus the value of "a" remains unchanged for the
first value of "a++".
However, when "a" is used for the second time, the value of "a" gets changed into the new value, because
the variable had been used once already for the increment purpose.
Thus, the first usage will be unchanged but the second one will change.

a++ * a = 1 * 2
The first time, we take the value of "a" as is, then its value is incremented by 1, so the next time we
encounter a, its value is 2

a++ * a * a = 1 * 2 * 2
a * a++ * a = 1 * 1 * 2

 */

/*
Postfix and Prefix

Consider the code snippet below. What will it print?

var num = 0
println(num++ + ++num)

// prints 2


Postfix means that the value gets added only after the variable has been used. In this case, the variable is being
used for the first time when it is being printed. Thus the value of "num" remains unchanged the first
time and results in 0 itself.
However, the second time, the postfix value gets incremented. Also, with the prefix, the value of "num"
changes readily and thus gets incremented twice. So now you gotta calculate what it might be!
 */