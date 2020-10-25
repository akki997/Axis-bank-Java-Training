package day1

fun main (args:Array<String>)
{
    var num=25
    var result=Math.sqrt(num.toDouble())
    println(result)
    var output=sum(5,10)
    println(output)


    var li=recursive(100.toLong())
    print(li)
}
fun recursive(x:Long, semiresult:Long=0):Long{
     var y=if(x<1)
    {
        x
    }
    else
         x+ recursive(x-1)
    return y
}
fun sum(x:Int,y:Int):Int
{
    return x+y
}