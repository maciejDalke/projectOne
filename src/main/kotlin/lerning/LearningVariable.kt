package lerning

var globalVariableOutside: String = "Top level variable"
var whenWontStoreNull: String? = null
var varWithoutType = "no type"

fun main() {
    helloKotlin("Maciej")
    varAndValDifferences()
    ifStatements()
    whenStatementsLikeSwitch("another")
    expressionToAssignAValue("Hello")
}

fun helloKotlin(name: String) {
    println("$name say: Hello Kotlin!")
    varWithoutType = "still no type"
//    getVarWithoutType = 111
}

fun varAndValDifferences() {
    println(globalVariableOutside)
//    var - variable -zmienna
//    val - read only variable
//    var name: String = "Maciej"
    var name = "Maciej"
    println(name)
    name = "Stanislaw"
    println(name)

//    val varNoChange: String = "Can't be modified when assign variable"
    val varNoChange = "Can't be modify when assign variable"
//    varNoChange = "new String"

    println(whenWontStoreNull)
    println(varNoChange)
}

fun ifStatements() {
    if (whenWontStoreNull != null) {
        println("is not null")
    } else {
        println("is null")
    }
}

fun whenStatementsLikeSwitch(variableWithNull: String?) {
    when (variableWithNull) {
        null -> println("hi")
        "var" -> println("should be \"var\"")
        else -> println(variableWithNull)
    }
}

// expression on assign a value to local value
fun expressionToAssignAValue(greeting: String?) {
//    val gretingToPrint = if (greeting != null) greeting else "hi"
    val gretingToPrintInIf = greeting ?: "hi"
    println("$gretingToPrintInIf Maciej")

    val gretingToPrintInWhen = when (greeting) {
        null -> "Hi"
        else -> greeting
    }
    println("$gretingToPrintInWhen Maciej")

}
