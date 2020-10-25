package day3

fun main()
{
    var str:String?="Welcome"
    if (str != null) {  // smart cast
        println(str.length)
    }

    // the smart cast also provides is or not is
    // is used to check whether the given type is of specific type
    // !is throws true or false basis on the comparison
    val temp:Any?=19

    if(temp is String &&  temp!=null)
    {
        println("$temp->Length is->${temp.length}")
    }
    else
        println("Its null value")
    if(temp !is String  && temp!=null)
    {
        println("Not a String")
    }
    else
        println("Its null value")
}