import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest extends Palindrome{
    int num, val;
    Palindrome sampleTest;
    boolean bool;
    @Before
    public void setUp() throws Exception {
        sampleTest= new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() throws Exception {
        //Arrange
        num=12321;
        //Act
        val=sampleTest.check(num);
        //Assert
        assertEquals(12321+"is a Palindrome",val+"is a Palindrome");
    }

    @Test
    public void checkNotPalindrome() throws Exception {
        // Arrange
        num= 123421;
        // Act
        val= sampleTest.check(num);
        // Assert
        assertEquals(124321+"is not a Palindrome",val+"is not a Palindrome");
    }

    @Test
    public void sumGreaterThanTwentyFive() throws Exception {
        // Arrange
        num= 8896988;
        // Act
        bool= sampleTest.sum(num);
        // Assert
        assertEquals( true, bool);
    }

    @Test
    public void sumLesserThanTwentyFive() throws Exception {
        //Arrange
        num=12421;
        //Act
        bool= sampleTest.sum(num);
        //Assert
        assertEquals(false, bool);
    }
}