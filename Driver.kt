class Driver(
    fullName: String,
    age: Int,
    currentSpeed: Double,
    private var vehicleType: String
) : Human(fullName, age, currentSpeed) {

    private var direction: Double = kotlin.random.Random.nextDouble(0.0, 2 * Math.PI)

    fun getVehicleType(): String = vehicleType
    fun setVehicleType(newType: String) { vehicleType = newType }

    override fun move() {
        x += currentSpeed * Math.cos(direction)
        y += currentSpeed * Math.sin(direction)

        println("Водитель ${getFullName()} на $vehicleType движется в точку (${"%.2f".format(x)}, ${"%.2f".format(y)})")
    }
}