package chap2.sec7.list2

import chap2.sec7.list1.Point

fun main(args: Array<String>) {

    // 7.1.2
    val p1 = Point(10, 20)
    val p2 = Point(30, 40)
    println(p1 + p2)
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}