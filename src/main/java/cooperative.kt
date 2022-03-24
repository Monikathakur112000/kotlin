import kotlinx.coroutines.*
//cooperative cancellation
fun main() = runBlocking {
    println("Main thread starts : ${Thread.currentThread().name}")
    val job : Job =launch(Dispatchers.Default){//runs on separate background thread
      try {
       for( i in 1..100){
            if(!isActive)
            {  return@launch
            }
            print(" $i "  )
            delay(5)
        }
          //exception handling
    }catch (e : CancellationException){
        println()
    println("Cancellation Exception")
      }
    }
    //inherits from immediate parent coroutine
    launch(Dispatchers.Unconfined) {
        println()
        println("another thread starts : ${Thread.currentThread().name}")
    }
    delay(10)
    job.cancelAndJoin()
   //call cancel and join function on the job object
  //join wait for the coroutine to finish
    println()
    println("Main thread end : ${Thread.currentThread().name}")
}