import org.junit.Assert.*
import org.junit.Test

class WallServiceTest {

    @Test
    fun addPost() {
        val post = WallService.add(Post())
        assertEquals(1, post.id)
    }

    @Test
    fun updatePostExist() {
        val post = WallService.add(Post())
        val exist = WallService.update(post.copy(text = "test text"))
        assertTrue(exist)
    }

    @Test
    fun updatePostNotExist() {
        val post = WallService.add(Post())
        val exist = WallService.update(post.copy(id = post.id + 1, text = "test text"))
        assertFalse(exist)
    }
}