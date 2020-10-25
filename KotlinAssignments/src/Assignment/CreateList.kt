package Assignment

fun main()
{
    var list1:List<String> = listOf("Apple","Banana","Mango","Litchi")
    var list2:List<Int> = listOf(1,3,4,5,6)
    var list3:List<Any> = listOf(1,5,"Apple",6,"Banana",3,"Mango")
    printList(list1)
    printList(list2)
    printList(list3)
}
fun <T>printList(list:List<T>)

{
    for(item in list)
        print(" "+item)
    println()
}