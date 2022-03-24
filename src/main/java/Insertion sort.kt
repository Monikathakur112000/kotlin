
//Insertion sort
fun insertionSort(input : MutableList<Int>):List<Int>{

    if(input.isEmpty() || input.size <2 ){
        return input
        
    }

    for (count in 1 until input.count()){

    //putting current element(input) in temporary variable(input1)
    val input1 = input[count]
    var  i = count

        //using while loop
    while(i>0 && input1 < input[i-1]){

        input[i] = input[i-1]
        i-=1

    }
    input[i] =input1

}
return input

}

fun main(){

    val list = mutableListOf(23,12,22,1,11,24,55,34)
   val pos= insertionSort(list)
    println(pos)

}