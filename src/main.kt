fun main () {
    val binnie = Cat("binnie", 10, 10)
    val clyde = Cat("clyde", 9, 8)
    val flathead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)
    binnie.walk()
    clyde.walk()
    flathead.eat(2)
    cupra.walk(4)
    println(binnie)
    println(clyde)
    println(flathead)
    println(cupra)
}