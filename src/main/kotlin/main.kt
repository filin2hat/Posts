fun main() {
    val post1 = WallService.add(Post(text = "First post", ownerID = 111, createdBy = 1))
    val post2 = WallService.add(Post(text = "Second text", ownerID = 222, createdBy = 3, likes = 3))
    val post3 = WallService.add(Post(text = "Hello!", ownerID = 333, createdBy = 15))

    WallService.update(post3.copy(id = 3, text = "Three post"))
    println(post3)
    }