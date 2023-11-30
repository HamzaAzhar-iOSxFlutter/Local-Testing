package jlin2.examples.localtesting

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun checkIfEmailIsValid() {
        assertTrue(EmailValidator.isValidEmail("123@abc.com"))
        assertTrue(EmailValidator.isValidEmail("123@abc.co.ca"))
    }

    @Test
    fun checkIfEmailIsInvalid() {
        assertFalse(EmailValidator.isValidEmail("123@abc"))
        assertFalse(EmailValidator.isValidEmail("123@abc..com"))
        assertFalse(EmailValidator.isValidEmail("@abc.com"))
        assertFalse(EmailValidator.isValidEmail("testing123"))
        assertFalse(EmailValidator.isValidEmail(""))
        assertFalse(EmailValidator.isValidEmail(null))
    }

}