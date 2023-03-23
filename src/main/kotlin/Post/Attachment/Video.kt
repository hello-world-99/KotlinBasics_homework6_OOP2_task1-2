package Post.Attachment

class Video( val id: Int,  val owner_id: Int, val title:String,val duration:Int, val description:String, val date:Int, val views:Int, val comments:Int ) :
    VideoAttachment() {

}