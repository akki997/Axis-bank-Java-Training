package day3

fun main()
{
    var si={p:Int,r:Float,t:Float->(p*r*t)/100}
    var interest=si(5000,5.5f,2.5f)
    print("Simple interest is $interest")
}