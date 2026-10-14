class Cat(private val name: String, private var age: Int, weightIn: Int) {

    var weight = weightIn
        private set

    public fun walk(distance: Int): Boolean {
        if (weight - distance >= 5) {
            weight -= distance
            return true
        }
        return false
    }

    public fun eat(amount: Int): Boolean {
        if (weight + amount <= 20) {
            weight += amount
            return true
        }
        return false
    }

    public override fun toString(): String {
        return "Name: $name, age: $age, weight: $weight"
    }
}