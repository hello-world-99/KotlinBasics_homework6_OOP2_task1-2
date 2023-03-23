import Post.Attachment.*
import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class WallServiceTest {

    var wall= WallService
    @Test
    fun add1() {

        val newPost=WallService.original.copy()

        assertEquals(wall.add(newPost).id!=0,true)
    }

    @Test
    fun update1() {

        val newPost=WallService.original.copy()
        wall.add(newPost)

        assertEquals(wall.update(newPost.copy(id=1)),true)
    }
    @Test
    fun update2() {

        val newPost=WallService.original.copy()
        wall.add(newPost)

        assertEquals(wall.update(newPost.copy(id=7)),false)
    }
    @Test
    fun update3() {

        val newPost=WallService.original.copy()
        wall.add(newPost)
        wall.add(newPost)
        wall.add(newPost)
        wall.update(newPost.copy(id=1, text = "changed"))
        assertEquals(wall.posts[0].text=="changed",true)
    }

    @Test
    fun attachment1(){
        val newPost=WallService.original.copy()
        newPost.attachments+=Audio(1,1,"1","1",100,"www.music.com",1672520400)
        wall.add(newPost)
        assertEquals(newPost.attachments.last().type=="Audio",true)
    }
    @Test
    fun attachment2(){
        val newPost=WallService.original.copy()
        newPost.attachments+=Video(1,1,"1",100,"1",1672520400,1,1)
        wall.add(newPost)
        assertEquals(newPost.attachments.last().type=="Video",true)
    }
    @Test
    fun attachment3(){
        val newPost=WallService.original.copy()
        newPost.attachments+=Document(1,1,"1",1,"png",1672520400)
        wall.add(newPost)
        assertEquals(newPost.attachments.last().type=="Document",true)
    }
    @Test
    fun attachment4(){
        val newPost=WallService.original.copy()
        newPost.attachments+=Photo(1,1,1,1,"100",1672520400,100,100)
        wall.add(newPost)
        assertEquals(newPost.attachments.last().type=="Photo",true)
    }
    @Test
    fun attachment5(){
        val newPost=WallService.original.copy()
        newPost.attachments+=Product(1,1,"adssda","sdadasd",100)
        wall.add(newPost)
        assertEquals(newPost.attachments.last().type=="Product",true)
    }

    @Before
    fun clearBeforeTest() {
        wall.clear()
    }

}