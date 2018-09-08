package chap2.sec7.list7

import chap2.sec7.Person
import chap2.sec7.Point

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
    
}
        
operator fun Point.get(index: Int): Int {
    return when(index) {
        0 -> x
        1 -> y
        else ->
            throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}