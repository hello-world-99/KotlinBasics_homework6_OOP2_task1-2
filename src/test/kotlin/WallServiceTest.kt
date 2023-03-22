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
    @Before
    fun clearBeforeTest() {
        wall.clear()
    }

}