package Post.Attachment

class Audio(override val id: Int, override val owner_id: Int, val name:String, val artist:String, val duration:Int, val url:String, val date:Int) : Attachment {

}