package Assignment

fun main()
{
    var list:ArrayList<Int> = arrayListOf(1,2,3,4,5,6)
    var array: Array<Any> = list.toArray()
    for(i in array)
    {
        print(" "+i)
    }
}