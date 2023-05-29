package Post.Attachment

data class AudioAttachment(override var type: String="Audio" , var file:Audio ) :Attachment {
}