open class Human(
    private var fullName: String,
    private var age: Int,
    override var currentSpeed: Double
) : Movable {

    override var x: Double = 0.0
    override var y: Double = 0.0

    fun getFullName(): String = fullName
    fun getAge(): Int = age
    fun getX(): Double = x
    fun getY(): Double = y

    fun setFullName(newName: String) { fullName = newName }
    fun setAge(newAge: Int) { age = newAge }
    fun setX(newX: Double) { x = newX }
    fun setY(newY: Double) { y = newY }

    override fun move() {
        val direction = kotlin.random.Random.nextDouble(0.0, 2 * Math.PI)

        x += currentSpeed * Math.cos(direction)
        y += currentSpeed * Math.sin(direction)

        println("$fullName переместился в позицию (${"%.2f".format(x)}, ${"%.2f".format(y)})")
    }
}