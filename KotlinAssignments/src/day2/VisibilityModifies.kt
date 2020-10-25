package day2

open class parent(){
     var a=100 // visible to all
    private var b=200 //visible to same class
    protected var c=300 //visible to parent and child class
    internal var d=400 //visible in same module
}
class child:parent()
{
    fun getVariable()
    {
        println(a)
        println(c)
        println(d)
    }
}
fun main(args:Array<String>)
{
    var x=child()
    x.getVariable()
    var y=parent()


}