//Binary search
fun binarySearch(input: List<Int>, element:Int):Int{

    var low=0
    var high = input.size -1
    var mid : Int

    //by using while loop
    while(low <= high){

        mid = (low + high)/2

        when {

            //search in the right half as element is greater than middle element
            element> input[mid] -> low = mid+1

            //return mid as element is equal to middle
            element==input[mid] -> return mid

            //search in the left half
            element<input[mid] -> high = mid-1

        }
    }

    return -1
}
fun main(){

    val input = listOf(3,5,1,2,4)
   val sortedList = input.sorted()
    println(sortedList)

    //printing the position of the element
    val position  = binarySearch(sortedList,3)
        println("The element is present at $position")


}
