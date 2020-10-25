package day1

import java.util.*

fun main(args:Array<String>)
{
 /* val num1=20
    val num2=20
    //val result = if(num1>num2) "$num1 i greater than $num2" else "$num2 is greater than $num1"
    //print(result)

    val result = if(num1>num2) "$num1 i greater than $num2"
    else if(num2>num1) "$num2 is greater than $num1"
    else
        "Both are equal"
    print(result)*/
    val read=Scanner(System.`in`);
    println("Enter the % score")
   /* var day=read.nextInt()
    var weekday=when(day)
    {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Number"
    }
    println("You entered $weekday")*/
    var score=read.nextInt()
    var result=when(score)
    {
        in 1..34->"Fail"
        in 35..49->"Third class"
        in 50..59->"Second Class"
        in 60..100->"First Class"
        else->"Invalid Number"
    }
    print(result)
}