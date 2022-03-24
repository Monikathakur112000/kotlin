//selection sort
fun selectionSort(input : MutableList<Int>):List<Int>{

    //size of the array
    val a = input.size
    var temp : Int

    //using for loop
    for ( i in 0 until a){

        var indexOfMin = i

    for( j in a-1 downTo i) {

        if(input[j]<input[indexOfMin]){

            indexOfMin=j
        }
    }

        if(i!=indexOfMin){

            temp=input[i]
            input[i]=input[indexOfMin]
            input[indexOfMin]=temp

        }
       }

    return input
    }


fun main(){

    val list = mutableListOf(23,12,22,1,11,24,55,34)
    val pos= selectionSort(list)
    println(pos)

}