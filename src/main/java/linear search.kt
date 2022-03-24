//linear search
fun linearSearch(list :List<Any>,key :Any): Int {

//using for loop
    for ((index, value) in list.withIndex()) {

        if(value == key)
           return index

    }

return -1

}

fun main(){

    val data = mutableListOf(1,33,5,6,9,23)
    val name = 1

    val position = linearSearch(data,name)
    println(" $name  is present at the index $position")

    val pos = linearSearch(data,33)
    println(pos)

}
