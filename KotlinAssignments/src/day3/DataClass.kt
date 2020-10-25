package day3

data class Employee(var empId:Int,var empName:String="Not Eneterd",var empEmail:String)
{

}
fun main(args:Array<String>)
{
    val e1=Employee(100,"Akshay","kumar.akshay1418@gmail.com")
    println(e1)
    val e2=Employee(100,"Akshay","kumar.akshay1418@gmail.com")
    println(e2)
    println(e1==e2)
    println(e1.equals(e2))
    val e3=e1.copy(1000)
    println(e3)
    val e4=Employee(10000,empEmail = "Akshay@gamil.com")
    println(e4)
}