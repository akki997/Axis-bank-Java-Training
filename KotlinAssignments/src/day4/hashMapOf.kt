package day4

fun main()
{
    val myMap1:HashMap<Int,String> = hashMapOf<Int,String>(1 to "Ravi", 2 to "Raju")
    val myMap2:HashMap<Any,Any> = hashMapOf<Any,Any>(1 to "Ravi", "eId" to 100, 'c' to "Raju")
    for (k in myMap1.keys){
        println("$k = ${myMap1.get(k)}")
    }

    for (k in myMap2.keys){
        println("$k = ${myMap1.get(k)}")
    }

}