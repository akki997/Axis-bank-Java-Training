package day4

fun main() {
    var list1: List<String> = listOf<String>("Apple", "Banana", "Litchi")
    var list2: List<Int> = listOf(1, 2, 4, 5, 6)
    var list3 : List<Any> = listOf(12,56,"Banana",56.4,'a',"Apple")
      list1.printList()
    list2.printList()
    list3.printList()
}
fun <T>List<T>.printList()
{
    for( x in this)
        print(" "+x)
}
