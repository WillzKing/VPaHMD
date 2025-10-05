fun main() {
    val movables: List<Movable> = listOf(
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

    val simulationTime = 5

    println("Начало симуляции на $simulationTime секунд")

    val threads = movables.mapIndexed { index, movable ->
        Thread {
            for (second in 1..simulationTime) {
                movable.move()
                Thread.sleep(1000)
            }
        }.apply {
            name = "Movable-$index"
            start()
        }
    }

    threads.forEach { it.join() }

    println("Симуляция завершена!")
}