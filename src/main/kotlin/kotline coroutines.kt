import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
//Launch function
fun main() =   runBlocking {

        //main thread
        println("Main starts - ${Thread.currentThread().name}")
        //Worker/background  thread
        /* thread {
        println("Worker thread - ${Thread.currentThread().name}")
        // Thread.sleep(1222)
    }*/
        //using the scope in coroutines
        GlobalScope.launch {
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