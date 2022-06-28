object WallService {
    private var posts = emptyArray<Post>()
    private var lastID = 0L


    fun add(post: Post): Post {
        posts += post.copy(id = setID())
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, thisPost) in posts.withIndex()) {
            if (thisPost.id == post.id) {
                posts[index] = post.copy(ownerID = thisPost.ownerID, date = thisPost.date)
                return true
            }
        }
        return false
    }

    private fun setID(): Long {
        lastID += 1
        return lastID
    }
}