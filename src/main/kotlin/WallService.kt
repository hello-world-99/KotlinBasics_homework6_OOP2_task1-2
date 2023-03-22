import Post.*
import Post.Donut.Donut
import Post.Donut.Placeholder
import Post.Geo.Geo
import Post.Geo.Place



object WallService{
    var posts = emptyArray<Post>()

    val original:Post=Post(0,1,1,1,
        1672520400,"helloworld",1,
        1,false, Comment(0,true,true,true,true),
        Copyright(1,"www.vk.com", "aaa", "type1"), Like(100,true,true,true),
        Repost(10, false), View(1000), "1",
        PostSource(), emptyArray<String>(), Geo("type1", "100 100", Place()),
        1, emptyArray<Int>(), true,true,true,true,
        false, false,
        Donut(false, 0, Placeholder(), false, "duration"), 1)

    private var id:Int=0

    fun add(post: Post): Post{


        id++
        val copyPost =post.copy(id=id)
        posts+=copyPost

        return posts.last()
    }
    fun update(post: Post): Boolean {
        var check:Boolean=false
        for (postCheck in posts){
            if(postCheck.id==post.id){
                postCheck.text = post.text
                check =true
            }
        }
        return check
    }

    fun clear() {
        posts = emptyArray()
        id=0
        // также здесь нужно сбросить счетчик для id постов, если он у вас используется
    }
}