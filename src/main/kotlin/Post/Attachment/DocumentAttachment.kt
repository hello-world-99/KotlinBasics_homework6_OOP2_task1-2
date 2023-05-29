package Post.Attachment
data class DocumentAttachment(override val type: String="Document", val file: Document) :Attachment {
}