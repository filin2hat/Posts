object WallService {
    private var posts = emptyArray<Post>()
    private var lastID = 0L


    fun add(post: Post): Post {
        posts += post.copy(id = setID())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, target) in posts.withIndex()) {
            if (target.id == post.id) {
                posts[index] = post.copy(id = target.id, ownerID = target.ownerID, date = target.date)
                return true
            }
        }
        return false
    }

    private fun setID(): Long {
        lastID += 1
        return lastID
    }

    fun getPosts() {
        for (post in posts) {
            val (id, _, _, _, _, text) = post
            println("ID = $id,Text =  $text")
        }
    }
}