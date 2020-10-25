package day2

class Emp(id:Int,name:String){
    var ename=""
    var eid:Int=0
init {
    eid=id
    ename=name
}
    /*fun input(id:Int,name:String)
    {
        eid=id
        ename=name

    }*/
    fun output()
    {
        print("Id is $eid\nname is $ename")
    }
}
fun main(args:Array<String>)
{
    var x=Emp(1,"Akshay")
    /*x.input(1,"Akshay")*/
    x.output()
}