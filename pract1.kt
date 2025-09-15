import kotlin.random.Random

class Human(
    private var fullName: String,
    private var age: Int,
    private var speed: Double = 1.0
) {
    private var x: Double = 0.0
    private var y: Double = 0.0

    fun getFullName() = fullName
    fun getAge() = age
    fun getSpeed() = speed

    fun setFullName(name: String) { fullName = name }
    fun setAge(newAge: Int) { age = newAge }
    fun setSpeed(newSpeed: Double) { speed = newSpeed }

    fun move() {
        val angle = Random.nextDouble(0.0, 2 * Math.PI)
        x += speed * kotlin.math.cos(angle)
        y += speed * kotlin.math.sin(angle)
        println("$fullName moved to position: (%.2f, %.2f)".format(x, y))
    }
}

fun main() {
    val humans = arrayOf(
        Human("Жора жорович", 25, 1.0),
        Human("Антон антонович", 30, 1.5),
        Human("Сергей сергеевич", 22, 0.8),
        Human("Сидоров Сидор", 22, 0.8),
        Human("Инокентий инокентьвеич", 22, 0.8),
        Human("Валера валерович", 22, 0.8),
        Human("Никита никитович", 22, 0.8),
        Human("Генадий генадьвеич", 22, 0.8),
        Human("Андрей андреевич", 22, 0.8),
        Human("Лёха лёхович", 22, 0.8),
        Human("Машина машинович", 22, 0.8),
        Human("Двейнскала джонович", 22, 0.8),
        Human("Брэд питович", 22, 0.8),
        Human("Том хардевич", 22, 0.8),
        Human("Шайла бафович", 22, 0.8),
        Human("Паша", 22, 0.8)
    )

    val simulationTime = 10
    val stepsPerSecond = 1

    for (time in 1..simulationTime) {
        println("---- Time: $time ----")
        humans.forEach { it.move() }
        Thread.sleep(1000L / stepsPerSecond)
    }
}