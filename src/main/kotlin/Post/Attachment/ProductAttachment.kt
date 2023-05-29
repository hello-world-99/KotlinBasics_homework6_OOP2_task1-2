package Post.Attachment

data class ProductAttachment(override val type: String="Product", val file: Product) :Attachment {
}