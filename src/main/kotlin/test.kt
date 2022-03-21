import kotlinx.coroutines.runBlocking
import org.junit.Assert
import org.junit.Test
class Test1{
    @Test
    fun firstTest()= runBlocking{
        suspension()
        Assert.assertEquals(12,6+6)
    }
}
