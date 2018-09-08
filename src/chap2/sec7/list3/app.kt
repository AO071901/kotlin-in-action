package chap2.sec7.list3

import chap2.sec7.list1.Point
import java.math.BigDecimal

fun main(args: Array<String>) {

    // 7.3
    val p = Point(10, 20)
    println(p * 1.5)
    
    //7.4
    println('a' * 3)
    
    var point = Point(1, 2)
    point += Point(3, 4)
    println(point)
    
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])
    
    // 7.5
    val p75 = Point(10,20)
    println(-p75)
    
    //7.6
    var bd = BigDecimal.ZERO
    println(bd++)
    println(++bd)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun Point.unaryMinus(): Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE