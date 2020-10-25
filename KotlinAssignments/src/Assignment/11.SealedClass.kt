package Assignment

sealed class Car{
    class Maruti():Car()
    class Honda():Car()
    class Hyundai():Car()
}
fun compute(c:Car)
{
    when(c)
    {
        is Car.Maruti->println("India Make")
        is Car.Honda->println("Japan Make")
        is Car.Hyundai->println("Korean Make")
    }
}
fun main(args:Array<String>){
    var circle=Car.Maruti()
    var square=Car.Honda()
    var rectangle=Car.Hyundai()

    compute(circle)
    compute(square)
    compute(rectangle)
}