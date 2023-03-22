package Post.Attachment

class Video(override val id: Int, override val owner_id: Int, val title:String,val duration:Int, val description:String, val date:Int, val views:Int, val comments:Int ) : Attachment {

}