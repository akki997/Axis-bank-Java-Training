package day4

fun main()
{
    val myMap1:MutableMap<Int,String> = mutableMapOf<Int,String>(1 to "Ravi", 2 to "Raju")
    val myMap2:MutableMap<Any,Any> = mutableMapOf<Any,Any>(1 to "Ravi", "eId" to 100, 'c' to "Raju")
    val myMap3:MutableMap<Int,String> = mutableMapOf()
    myMap3.putAll(myMap1)
    println(myMap3)
    for (k in myMap1.keys){
        println("$k = ${myMap1.get(k)}")
    }

    for (k in myMap2.keys){
        println("$k = ${myMap1.get(k)}")
    }

}