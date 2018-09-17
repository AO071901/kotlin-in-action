package chap2.sec7.list14


data class NameComponents(val name: String, val extension: String)

fun splitFileName14(fullName: String): NameComponents {
    val result = fullName.split(".", limit = 2)
    return NameComponents(result[0], result[1])
}

fun splitFileName15(fullName: String): NameComponents {
    val (name, ext) = fullName.split(".", limit = 2)
    return NameComponents(name, ext)
}

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }
}

fun main(args: Array<String>) {
    // list7.14
    val (name14, ext14) = splitFileName14("kotlin.kt")
    println(name14)
    println(ext14)
    // list7.15
    val (name15, ext15) = splitFileName15("kotlin.kt")
    println(name15)
    println(ext15)
    // list7.16
    printEntries(mapOf("FOO" to "foo", "BOO" to "boo"))
    for (entry in mapOf("FOO" to "foo", "BOO" to "boo").entries){
        val key = entry.component1()
        val value = entry.component2()
        println("$key -> $value")
    }
}