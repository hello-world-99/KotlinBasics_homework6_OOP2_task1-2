package Post.Attachment

data class VideoAttachment(override val type: String="Video", val file: Video) :Attachment {
}