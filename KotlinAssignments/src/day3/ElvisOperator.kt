package day3

fun main()
{
    var str1:String?=null
    var str2:String?="Welcome"
    var len1:Int=str1?.length ?:0
    var len2:Int=str2?.length?:0
    println(len1)
    print(len2)
}