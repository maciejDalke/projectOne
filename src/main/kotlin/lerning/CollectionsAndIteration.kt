package lerning

val interestingThings = arrayOf("Kotlin", "Programing", "Comic Books","Computer games", "Volleyball")

fun main() {
    useNormalFunctionAfterDot()
    tryForLoop()
    forEachFunction()
    forEachIndexFunction()
}

//TODO: https://youtu.be/F9UC9DY-vIU?t=2482 jutro

fun useNormalFunctionAfterDot() {
    println(interestingThings.size)

//    println(interestingThings.get(0))
    println(interestingThings[0])
}

fun tryForLoop() {
    for (interestingThings in interestingThings) {
        println(interestingThings)
    }
}

fun forEachFunction(){
//    interestingThings.forEach {
//        println(it)
//    }
    interestingThings.forEach { interestingThing ->
        println(interestingThing)
    }
}
fun forEachIndexFunction(){
    interestingThings.forEachIndexed { index, interestingThing ->
        println("$interestingThing is at index $index")
    }
}
