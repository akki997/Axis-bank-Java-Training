package day2

class Employee
{
     var name:String="Akshay"
    inner class nested{
        private var str:String="Priyam"
        fun foo()
        {
            println(name)
            println(str)
        }
    }
}
fun main(args:Array<String>)
{
   var x=Employee().nested()
    x.foo()



}
