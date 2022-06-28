import java.time.LocalDate

data class Post(
    val id: Long = 0,
    val ownerID: Long = 0,
    val fromID: Long = 100,
    val createdBy: Int = 0,
    val date: LocalDate = LocalDate.now(),
    val text: String = "New Post",
    val replyOwnerID: Int = 1,
    val replyPostID: Int = 1,
    val friendsOnly: Boolean = false,
    val likes:Int = 0,
    val repost:Int = 0,
    val views:Int = 0,
    val postType:String = "post",
    val signerID:Int = 1,
    val canPin:Boolean = true,
    val canDelete:Boolean = true,
    val canEdit:Boolean = true,
    val isPinned:Boolean = false,
    val markedAsADS:Boolean = false,
    val isFavorite:Boolean = false,
    )
