import kotlinx.coroutines.*

//Launch function
fun main()=runBlocking{
    //main thread
    println("Main starts - ${Thread.currentThread().name}")
    //using the scope in coroutines

     val jobDeferred: Deferred<Any> =async{
        println("Worker thread start- ${Thread.currentThread().name}")
        suspension()// coroutine is paused
        println("Worker thread ends - ${Thread.currentThread().name}")
         "data"
    }
    jobDeferred.await()
    //jobDeferred.join()
    println("Main ends - ${Thread.currentThread().name}")
}
suspend fun suspension(){
    delay(1000)
}

