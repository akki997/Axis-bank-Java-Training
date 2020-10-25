package day3



fun main()
{
    var location:Any="Manipal"
    val unsafe:String?=location as String
    println("Unsafe $unsafe")

    val safeString:String?=location as? String
    println("Unsafe $safeString")

    val safeInt:Int?=location as? Int
    println("safeInt $safeInt")

}