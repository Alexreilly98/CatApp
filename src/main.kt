fun main () {
    val tom = Cat("Tom", 10, 10)
    val mary = Cat("Mary", 9, 8)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    tom.walk()
    mary.walk()
    flathead.eat(2)
    cupra.walk(4)
    println(tom)
    println(mary)
    println(flathead)
    println(cupra)
}