import models.getPersons
import kotlin.test.Test
import kotlin.test.assertTrue

class PersonsTest {
    @Test
    fun trueIsTrue() {
        assertTrue(true)
    }

    @Test
    fun getPersonsTest() {
        val persons = getPersons()
        assertTrue(persons.isNotEmpty())
    }
}