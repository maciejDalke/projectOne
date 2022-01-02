package lerning

fun getGreeting(stringVariable: String?): String? {
    return stringVariable
}
fun singleExpressionFunction() = "Hello Kotlin"

// zamiast void jest Unit
fun sayHello()/*: Unit*/ {
    println(getGreeting("null"))
}

fun sayHello(itemToGreet: String) {
    val msg = "Hello $itemToGreet"
    println(msg)
}
fun sayHello(greeting: String, itemToGreet: String) = println("$greeting $itemToGreet")


fun main() {
    println("Hello world")
    println(getGreeting(null))
    sayHello("Hi","Maciej")
    sayHello("Maciej")
    sayHello()
    println(singleExpressionFunction())
}

// top level functions
