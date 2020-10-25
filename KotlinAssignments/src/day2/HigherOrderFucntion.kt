package day2

fun welcome(name:String,job:String, fn:(String,String)->String)
{
    val result=fn(name,job)
    println(result)
}
fun main(args:Array<String>)
{
    val fn:(String,String)->String={name,job->"$name is $job - Java"}
    welcome("Akshay","Teaching",fn);
}