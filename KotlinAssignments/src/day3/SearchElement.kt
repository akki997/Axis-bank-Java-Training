package day3

fun main()
{
    var n=5
    var e=search(n)
    print("IS $n present in the list : $e")

}
fun search(x:Any):Boolean{
    var ar= arrayListOf<Any>("Mango",6,"Apple",5,"Banana")
    if(ar.contains(x))
        return true
    return false
}