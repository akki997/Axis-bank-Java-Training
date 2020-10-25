package day2



open class Emp4(name:String,age:Int,sal:Double)
{
    init {
        println("EmpName ${name}")
        println("EmpAge ${age}")
        println("EmpSalary ${sal}")
    }
}
open class Developer1(name:String,age:Int,sal:Double,project:String):Emp3(name,age,sal)

{
    init {
        println("EmpProject ${project}")
    }
}
class Salesperson(name:String,age:Int,sal:Double,project:String,target:Int):Developer1(name,age,sal,project)
{
    init {
       println("EmpTarger ${target}")
    }
}
fun main(args:Array<String>)
{
    val d=Salesperson("Akshay",23,500000.0,"Ecommerce",4)

}