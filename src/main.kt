fun main() {
    var a=product(arrayOf(2,3,4,5,6,7))
    println(a)
    var b=mixed(arrayOf(2.4,3,"Akuot",true,8.9))
    println(b)
    var c=vowels(arrayOf('a','b','c','d','e','f','g','h','i','j','o','u','z'))
    println(c)



}
//Write a function that takes in an array of integers and returns the product of
//all the elements
fun product (num:Array<Int>):Int {
    var value = 1
    num.forEach { mine ->
        value*=mine
    }
    return value
}
//Write a function that takes in an array of mixed types and returns the sum of
//all the decimal elements
fun mixed(name:Array<Any>):Double{
    var sum = 0.0
    name.forEach { add ->
        if (add is Double){
        sum+= add
    }
}
    return sum
}
//Write a function that takes in an array of characters and returns the number of
//vowels in the array
fun vowels( word:Array<Char>):Int{
    var count=0
    word .forEach { vowel->
        if (vowel =='a'|| vowel=='e'|| vowel=='i' || vowel=='o' || vowel=='u'){
    count++

    }

    }
    return count
}












