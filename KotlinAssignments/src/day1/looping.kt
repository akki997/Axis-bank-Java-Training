package day1

fun main(args:Array<String>)
{
    val marks= arrayOf(89,90,45,56)

    for(i in marks)
        print(i.toString()+" ")
    val fruits= arrayOf("Mango","Apple","Banana","Litchi")
    println()
    for(j in fruits)
        print(j+" ")
    println()
    for(k in marks.indices )
        println("marks[$k]" + " = "+marks[k])
    val n=5
    for (i in 5 downTo 1 step 2) print(i)
}