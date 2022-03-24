// predefined target Annotation in kotlin
@Target(AnnotationTarget.CONSTRUCTOR,AnnotationTarget.LOCAL_VARIABLE)
annotation class Annot
    class Annot1 @Annot constructor(private val count : Int){
        fun display(){
            println("Constructor annotated")
            println(count)
        }
    }

//Repeatable annotation
@Repeatable
//retention annotation in the kotlin
@Retention(AnnotationRetention.SOURCE)
annotation class Class1(val value: String)
@Class1("vb")
@Class1("ANNOT")

data class Miscellaneous(val Name : String, val Age : Int)
fun destruct():Miscellaneous{
    return Miscellaneous("Monika",21)
}
fun main() {
    // Destructuring Declarations in Kotlin
    val (name, age) = destruct()
    println(name)
    println(age)
    val map = mutableMapOf<Int, String>()
    map[1] = "Monika"
    map[2] = "Astha"
    map[3] = "Anjali"
    println(map)
    val newMap = map.mapValues { (_, _) -> "Hello $map" }
    println("After appending")
    println(newMap)
    println()
    //Annotation
    val obj = Annot1(8)
    obj.display()
    @Annot val string = "Local parameter Annotation"
    println(string)
    println("Retention annotation")

}
