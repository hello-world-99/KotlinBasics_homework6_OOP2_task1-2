package Post.Attachment

class Product(override val id: Int, override val owner_id: Int, val title: String, val description: String, val price: Int) :Attachment {
}