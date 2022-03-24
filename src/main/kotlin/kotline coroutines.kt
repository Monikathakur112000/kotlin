
import kotlinx.coroutines.*

//Launch function

fun main() =   runBlocking {

        //main thread
        println("Main starts - ${Thread.currentThread().name}")



        //using the scope in coroutines
        launch(Dispatchers.Default) {
            println("Worker thread start- ${Thread.currentThread().name}")

            suspension(1222)// coroutine is paused

            println("Worker thread ends - ${Thread.currentThread().name}")

        }
        suspension(2332)
        println("Main ends - ${Thread.currentThread().name}")
    }
//by using suspending function
suspend fun suspension(time : Long){
delay(time)
}