package day3

fun main()
{
    var c=count("Hello how are you")
    print("Number of vowels in String are $c")
}

fun count(s: String): Any {

    var c=0
    for (i in s.indices)
        if (s[i].equals('a')||s[i].equals('e')||s[i].equals('i')||s[i].equals('o')||s[i].equals('u'))
            c++
    return c

}
