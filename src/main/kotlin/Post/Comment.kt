package Post

data class Comment (
    var count:Int,
    val can_post:Boolean,
    val groups_can_post:Boolean,
    val can_close:Boolean,
    val can_open:Boolean
) {
}