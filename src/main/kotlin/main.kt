val post = Post()
fun main() {
    WallService.add(Post(text = "First post!"))
    WallService.add(Post(text = "Hello!"))

    WallService.update(post.copy(id = 2, text = "Second post!"))

    for (post in WallService.getPosts())
        println(post)
}