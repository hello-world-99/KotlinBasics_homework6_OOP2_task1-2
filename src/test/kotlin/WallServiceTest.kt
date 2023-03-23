import Post.Attachment.Attachment
import Post.Attachment.Audio
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
    fun attachment(){
        val newPost=WallService.original.copy()
        newPost.attachments+=Audio(1,1,"1","1",100,"www.music.com",1672520400)
        wall.add(newPost)
        assertEquals(newPost.attachments.last().type=="Audio",true)
    }

    @Before
    fun clearBeforeTest() {
        wall.clear()
    }

}