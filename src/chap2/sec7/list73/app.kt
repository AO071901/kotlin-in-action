package chap2.sec7.list73

import chap2.sec7.list71.Point

fun main(args: Array<String>) {

    // 7.1.3
    val p = Point(10, 20)
    println(p * 1.5)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}