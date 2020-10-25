package day4

import java.util.*
import kotlin.collections.ArrayList

class emp(var empId:Int,var name:String){


}
fun main()
{
    var read=Scanner(System.`in`)
    println("Enter the number of objects you want to enter in a ArrayList")
    var n=read.nextInt()
    var arr:ArrayList<emp> = arrayListOf<emp>()
    for(x in 0..n-1)
    {
        println("Enter the id of Employee ${(x+1)}")
        var id=read.nextInt()
        println("Enter the name of Employee ${(x+1)}")
        var name=read.next()
        var e=emp(id,name)
        arr.add(e)
    }

    println("Details of Employee")
    for(j in arr)
        println(j.empId.toString() +" "+j.name)
   /* var e=emp(101,"Akshay")
    var map= mapOf<Int,emp>(1 to e)
    for(x in map.entries)
        print(x.value.empId)*/

}