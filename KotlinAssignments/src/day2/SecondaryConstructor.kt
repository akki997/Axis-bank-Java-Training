package day2


class Emp1(city:String){
    var ename=""
    var eid:Int=0
    var ecity=""

    /*fun input(id:Int,name:String)
    {
        eid=id
        ename=name

    }*/
    /*fun output()
    {
        print("Id is $eid\nname is $ename")
    }*/
    constructor(id:Int,name:String,city:String):this(city)
    {
        eid=id
        ename=name
        print("id is $eid\nname is $ename\ncity is ${city}")
    }

}
fun main(args:Array<String>)
{
    var x=Emp1(1,"Akshay","Delhi")
    /*x.input(1,"Akshay")*/
   // x.output()
}