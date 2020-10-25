package Assignment

class Student(var roll:Int,var name:String,var city:String)
{

}
fun main()
{
    var s1=Student(100,"John","Bangalore")
    var s2=Student(102,"Saurav","Bangalore")
    var s3=Student(103,"Anjali","Lucknow")
    var s4=Student(104,"Aishwarya","Bangalore")
    var s5=Student(105,"Rashwin","Mangalore")
    var s6=Student(106,"Chaitanya","Bangalore")
    var s7=Student(107,"Nichit","Bangalore")
    var s8=Student(108,"Rahul","Bangalore")
    var s9=Student(109,"Charan","Bangalore")
    var s10=Student(110,"Akshay","Delhi")
    var map:MutableMap<Int,Student> = mutableMapOf()
    map.put(1,s1)
    map.put(2,s2)
    map.put(3,s3)
    map.put(4,s4)
    map.put(5,s5)
    map.put(6,s6)
    map.put(7,s7)
    map.put(8,s8)
    map.put(9,s9)
    map.put(10,s10)
    for(item in map.entries)
    {
       if (item.value.city.equals("Bangalore"))
           println("Roll no is ${item.value.roll} Name is ${item.value.name} and City is ${item.value.city}")

    }
}