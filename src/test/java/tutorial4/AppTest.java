package tutorial4

import junit.framework.Test
import junit.framework.TestCase
import junit.framework.TestSuite

/**
 * Unit test for simple App.
 */
class AppTest
/**
 * Create the test case
 *
 * @param testName name of the test case
 */
(testName: String) : TestCase(testName) {

    /**
     * Rigourous Test :-)
     */
    fun testApp() {
        val c = Calc()
        val a = 10
        val b = 20
        TestCase.assertTrue(c.add(a, b) == a + b)
    }

    companion object {

        /**
         * @return the suite of tests being tested
         */
        fun suite(): Test {
            return TestSuite(AppTest::class.java!!)
        }
    }
}
