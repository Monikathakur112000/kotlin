//bubble sorting
fun bubbleSort(input : MutableList<Int>):List<Int>{

    var swap = true

//using while loop
    while(swap) {

        swap = false

        //using for loop
        for (i in 0 until input.size-1) {

            if(input[i]>input[i+1]) {
                val temp = input[i]
                input[i] = input[i+1]
                input[i+1] = temp

                swap = true

            }
        }
    }

    return input
}

fun main(){

        val list = mutableListOf(23,12,22,1,11,24,55,34)

        val pos= bubbleSort(list)
        println(pos)

    }