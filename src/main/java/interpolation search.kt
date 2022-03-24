//Interpolation search
fun interpolationSearch(input: List<Int>, element:Int):Int{

    var low=0
    var high = input.size -1
    var pos : Int

    //by using while loop
    while(low<=high){

        pos = low +(((high - low) / (input[high] - input[low])) * (element - input[low]))

        when {
            //search in the right half as element is greater than middle element
            element> input[pos] -> low = pos+1

            //return mid as element is equal to middle
            element==input[pos] -> return pos

            //search in the left half
            element<input[pos] -> high = pos-1

        }
    }
    return -1

}

fun main(){

    val input = listOf(1,3,6,7,9,12)
    println(input)

    //printing the position of the element
    val position  = interpolationSearch(input,6)
    println("The element is at index $position")

}
