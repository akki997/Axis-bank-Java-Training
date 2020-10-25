package Assignment

fun main()
{
    var list1:List<String> = listOf("Apple","Banana","Mango","Litchi")
    var list2:List<Int> = listOf(1,3,4,5,6)
    var list3:List<Any> = listOf(list1 + list2)
    printList(list3)
}