package day2

//Multiple interfaces can be inherited by a single class
interface Shape{
    fun pickShape()
    {
        println("I am Shape..you pick shape from me")
    }
}
interface Paint{
    fun pickColor(){
        println("I am from paint..pick color from me")
    }
}
class Draw:Shape,Paint
{
    fun draw()
    {
        pickShape()
        pickColor()
    }
}

fun main(args:Array<String>)
{
    var d=Draw()
    d.draw();
}