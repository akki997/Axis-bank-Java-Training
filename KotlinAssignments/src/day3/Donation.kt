package day3

import java.lang.NumberFormatException
import java.util.*

fun main()
{
    var read=Scanner(System.`in`)
    println("Enter the age")
    var age=read.nextInt()
    println("Enter the weight")
    var weight=read.nextInt()
    try {
        var d = donate(age, weight)
        print("Can donate blood")
    }catch(e:NumberFormatException)
    {
        print("Can't donate blood")
    }
}

fun donate(age: Int, weight: Int): Any {
if(age>18 && weight>55)
    return true
    else
    throw NumberFormatException()
}
