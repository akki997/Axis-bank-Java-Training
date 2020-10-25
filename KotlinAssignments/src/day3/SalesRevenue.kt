package day3

import java.util.*

fun main(args:Array<String>) {

  var  read=Scanner(System.`in`)
    println("Enter the sale revenue")
    var sale=read.nextInt()
    var bonus= when(sale)
    {
      in  10000..20000->1500
        in 21000..40000->2500
        in 41000..60000->3500
        else->
            print("Invalid")
    }
    print("Bonus is $bonus")
}