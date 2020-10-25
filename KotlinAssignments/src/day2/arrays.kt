package day2

fun main(args:Array<String>)
{
    var ar= arrayOf(70,45,"Apple",50,"Banana")
    ar.set(2,"Mango")
    for(items in ar)
        println(items)
}