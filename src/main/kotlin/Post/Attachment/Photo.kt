package Post.Attachment

class Photo(override val id: Int, override val owner_id: Int,val album_id:Int,val user_id: Int, val text:String, val date:Int, val width:Int, val height:Int) : Attachment {


}