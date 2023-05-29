package Post.Attachment

data class PhotoAttachment(override val type: String="Photo", val file: Photo) :Attachment {
}