package day3

class Account(accId:Int,acc_type:String,name:String)
{
    init {
        println("AccountId is $accId")
        println("AccountType is $acc_type")
        println("Name is $name")
    }
}
fun main()
{
    var a1=Account(101,"Saving","Akshay")
    var a2=Account(102,"Current","Akshay")
    var a3=Account(103,"Saving","Akshay")
    var a4=Account(104,"Current","Akshay")
    var a5=Account(105,"Saving","Akshay")


}