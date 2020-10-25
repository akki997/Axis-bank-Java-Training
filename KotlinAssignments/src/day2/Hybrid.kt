package day2

open class Emp6
{
    constructor(name:String, age:Int, salary:Float){
        println("EmpName ${name}")
        println("EmpAge ${age}")
        println("EmpSalary ${salary}")
    }
    fun doWork()
    {
        println("I love to do work")
    }
}
 class Developer3 :Emp6
{

    constructor(name:String,age:Int,salary:Float,project:String):super(name,age,salary){
        println("Emp Project ${project}")
    }
    fun doProgram()
    {
        println("I love to code")
    }
}

class SalesPerson2:Emp6
{
    constructor(name:String,age:Int,salary:Float,bonus:Float):super(name,age,salary){
        println("EMp Bonus is ${bonus}")
    }
    fun doTravel()
    {
        println("I love to travel")
    }
}

fun main(args:Array<String>)
{
    val d=SalesPerson2("John",25,4000f, bonus=10000f)
    d.doTravel()
    d.doWork()
    val x=Developer3("Akshay",23,50000f,"Ecommerce")
    x.doProgram()
    x.doWork()

}
