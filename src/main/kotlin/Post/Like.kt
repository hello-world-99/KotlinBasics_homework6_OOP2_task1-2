package Post
data class Like(
    var count:Int,
    var user_likes:Boolean,
    var can_like:Boolean,
    var can_publish:Boolean
) {
}