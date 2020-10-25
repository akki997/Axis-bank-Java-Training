package day2

class Emp2{


    /*fun input(id:Int,name:String)
    {
        eid=id
        ename=name

    }*/
    /*fun output()
    {
        print("Id is $eid\nname is $ename")
    }*/
    constructor(id:Int,name:String):this(id,name,"Delhi")
    {

        println("id is ${id}\nname is ${name}")
    }
    constructor(id:Int,name:String,city:String)
    {
        println("id is ${id}\nname is ${name}\ncity is ${city}")
    }

}
fun main(args:Array<String>) {
    var x = Emp2(1, "Akshay")
/*x.input(1,"Akshay")*/
// x.output()
}