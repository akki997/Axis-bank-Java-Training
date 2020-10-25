package Assignment

class Calculator
{
    companion object{
        fun add(num1:Int,num2:Int):Int
        {
            return num1+num2
        }
        fun sub(num1:Int,num2:Int):Int
        {
            return (num1-num2)
        }
        fun mul(num1:Int,num2:Int):Int
        {
            return num1*num2
        }
        fun div(num1:Int,num2:Int):Int
        {
            return num1/num2
        }


    }
}
fun main()
{
    println(Calculator.add(5,6))
    println(Calculator.sub(6,5))
    println(Calculator.mul(5,6))
    println(Calculator.div(10,5))
}

