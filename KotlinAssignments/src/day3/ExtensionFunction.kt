package day3

class Vehicle{
    fun run():String{
        return "Vehicle is running"
    }
}
fun Vehicle.stop():String
{
    return "Vehicle is stopped"

}
fun main()
{
    var map:MutableMap<Int,String> = mutableMapOf()

    val v=Vehicle()
    println(v.run())
    println(v.stop())
    map.put(1,v.stop())
}