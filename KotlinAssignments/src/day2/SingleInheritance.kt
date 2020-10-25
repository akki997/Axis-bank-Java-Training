package day2

open class Emp3(name:String,age:Int,sal:Double)
{
    init {
        println("EmpName ${name}")
        println("EmpAge ${age}")
        println("EmpSalary ${sal}")
    }
}
class Developer(name:String,age:Int,sal:Double,project:String):Emp3(name,age,sal)

{
init {
    println("EmpProject ${project}")
}
}
fun main(args:Array<String>)
{
    val d=Developer("Akshay",23,500000.0,"Ecommerce")

}