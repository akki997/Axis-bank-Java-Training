package day2

class Student
{
    var rollno =0
    var name=" "
    var city=""
    fun input(r:Int,n:String,c:String)
    {
        rollno=r
        name=n
        city=c
    }
    fun output()
    {
        println("Roll no is $rollno \n name is $name \n city is $city")
    }

    fun changeAddress(roll:Int,na:String,ci:String)
    {
        rollno=roll
        name=na
        city=ci
    }


}
fun main(args:Array<String>)
{
    var x= Student()
    x.input(3,"Akshay","Delhi")
    x.output()
    x.changeAddress(4,"Vanshika","Gurgaon")
    x.output()
}