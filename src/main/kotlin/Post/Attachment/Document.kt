package Post.Attachment

class Document( val id: Int,  val owner_id: Int, val title: String, val size: Int, val ext: String, val date: Int) :
    DocumentAttachment("Document") {
}