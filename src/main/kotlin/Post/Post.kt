package Post

import Post.*
import Post.Attachment.Attachment
import Post.Donut.Donut
import Post.Geo.Geo

data class Post(
    val id:Int=0,
    var owner_id:Int,
    var from_id:Int,
    var created_by:Int,
    val date:Int,
    var text:String?,
    var reply_owner_id:Int,
    var reply_post_id:Int,
    var friends_only:Boolean,
    var comments: Comment?,
    val copyright:Copyright?,
    var likes: Like,
    var reposts: Repost?,
    var views: View?,
    var post_type:String,
    var post_source: PostSource,
    var attachments:Array<Attachment>,
    val geo:Geo?,
    var signer_id:Int,
    var copy_history:Array<Int>,
    var can_pin:Boolean,
    var can_delete:Boolean,
    var can_edit:Boolean,
    var is_pinned:Boolean,
    var marked_as_ads:Boolean,
    var is_favorite:Boolean,
    var donut:Donut?,
    var postponed_id:Int) {

}
