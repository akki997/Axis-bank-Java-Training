package day3

import java.util.*

fun main()
{
    val read=Scanner(System.`in`)
    var array=IntArray(read.nextInt())
    for( i in array)
        array[i]=read.nextInt()

    for(x in array)
        print(x)
}