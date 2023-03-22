package Post.Attachment

class Document(override val id: Int, override val owner_id: Int, val title: String, val size: Int, val ext: String, val date: Int) :Attachment {
}