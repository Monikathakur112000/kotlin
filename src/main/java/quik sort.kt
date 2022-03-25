//quick sort
fun quickSort(list : List<Int>):List<Int> {

    if(list.size <2){
        return list
    }

    val pivot = list[list.size/2]

    val equal = list.filter{ it==pivot}

    val low = list.filter{ it < pivot}

    val high = list.filter{ it>pivot}

    return quickSort(low)+equal+quickSort(high)

}

fun main(){

    val list = mutableListOf(23,21,3,4,2,6,7,33,1,545,333,22)
    val pos = quickSort(list)
    println(pos)

}