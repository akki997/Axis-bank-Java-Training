package day3

class Student(roll:Int,name:String)
{
    init {
        println("Roll number is $roll and name is $name")
    }
    companion object{
        fun collegename():String
        {
            return ("MSIT")
        }
    }
}
fun Student.Companion.collegeloc():String
{
    return("JanakPuri")
}
fun main(args:Array<String>)
{
    val s=Student(100,"Akshay")
    println(Student.collegename())
    println(Student.collegeloc())
    val s1=Student(101,"Vanshika")
    println(Student.collegename())
    println(Student.collegeloc())
}