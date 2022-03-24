import kotlin.math.min
import kotlin.math.sqrt

//jumping search
fun jumpSearch(input: List<Int>, element:Int):Int {
    var left = 0
    var right = 0

    // Finding block size to be jumped
    val jump = sqrt(input.size.toDouble()).toInt()
    while (left < input.size && input[left] <= element) {
        right = min(input.size - 1, left + jump)
        if (input[right] >= element) {
            break
        }
        left += jump
    }

    if (left >= input.size || input[left] > element) {
        return -1
    }

    // Doing a linear search for element in block
    // beginning with left
    while (left <= right && input[left] <= element) {

        // If element is found
        if (input[left] == element) {
            return left
        }
        left++
    }
    return -1

}
fun main(){

    val input = listOf(3,5,1,2,4,6,9,7,8,10)
    val sortedList = input.sorted()
    println(sortedList)

    //printing the position of the element
    val position  = jumpSearch(sortedList,3)
    println("The element is present at $position")


}
