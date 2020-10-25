package day3

import java.util.*

fun main()
{

    var str:String?="Welcome"
    var len=if(str!=null) str.length else 0
    println(len)

    str=null
    len=if(str!=null) str.length else 0
    println(len)

}