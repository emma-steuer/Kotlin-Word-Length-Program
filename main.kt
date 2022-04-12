import kotlin.math.sqrt

fun main(args: Array<String>) {
    
    println("Write a list of names: ")
    val input: String = readLine().toString()
    val names: List<String> = input.split(' ')
    
    val nums: (String) -> Double = {it.length.toDouble()}
    val result1 = names.map(nums)
    val mean = (result1.sum() / names.size).toDouble()
    println("Average word length: " + mean)
    
    val numMinusMean: (Double) -> Double = {it - mean.toDouble()}
    val result2 = (result1.map(numMinusMean))

    val squared: (Double) -> Double = {Math.pow(it.toDouble(), 2.0)}
    val result3 = result2.map(squared)

    val sums = result3.sum()

    val variance = (sums / (names.size)) 

    val stndDev = sqrt(variance)
    println("The standard deviation for this list of names is: " 
    + stndDev)
}   