package Post.Donut

data class Donut(
    val is_donut:Boolean,
    val paid_duration:Int,
    val placeholder:Placeholder,
    val can_publish_free_copy:Boolean,
    val edit_mode:String
) {
}