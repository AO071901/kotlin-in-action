package chap2.sec7.list7

import chap2.sec7.MutablePoint
import chap2.sec7.Person
import chap2.sec7.Point
import chap2.sec7.Rectangle

fun main(args: Array<String>) {
    
    // 7.7
    println(Point(10, 20) == Point(10, 20))
    println(Point(10, 20) != Point(5,5))
    println(null == Point(1,2))
    
    // 7.8
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    val p3 = Person("Bob", "Johnson")
    println(p1 < p2)
    println(p1 > p2)
    println(p2 < p3)
    println(p2 > p3)
    println("abc" < "bac")
    
    // 7.9
    val p = Point(10, 20)
    println(p[0])
    println(p[1])
    println(p.get(0))
    println(p.get(1))
    
    // 7.10
    val mp = MutablePoint(10, 20)
    mp[1] = 42
    println(mp)
    
    // 7.11
    val rect = Rectangle(Point(10, 20), Point(50,50))
    println(Point(20,30) in rect)
    println(Point(5,5) in rect)
}
        
operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}