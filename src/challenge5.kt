class Summation(var num1:Int,var num2:Int)
{
    fun add ():Int{
        return num1+num2;
    }
}

fun main()
{
    var sum= Summation(5,7)

    println("${sum.num1}+${sum.num2} = ${sum.add()}");
}