import java.util.Scanner

fun main(args: Array<String>) {
    val reader = Scanner(System.`in`)

    print("Введите X: ")
    val x = reader.nextInt()

    print("Введите y: ")
    val y = reader.nextInt()

    val result = if ((x > 0) and (y > 0)) {
        "Первая четверть"
    } else if ((x < 0) and (y > 0)) {
        "Вторая четветь"
    } else if ((x < 0) and (y < 0)) {
        "Третья четветь"
    } else if ((x > 0) and (y < 0)) {
        "Четвёрная четветь"
    } else {
        "Неверный ввод"
    }
    print(result)
}