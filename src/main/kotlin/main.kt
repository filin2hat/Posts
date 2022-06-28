import java.time.LocalDate

fun main() {
    val post = WallService.add(
        Post(
            1,
            100,
            200,
            777,
            LocalDate.now(),
            "First Post",
            300,
            99,
            false, ArrayList(),
            1,
            0,
            10,
            "post",
            2
        )
    )
    println(post)
}