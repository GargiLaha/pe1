import com.stackroute.pe1.IntegerSum;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerSumTest extends IntegerSum {
        IntegerSum samplecheck;
        String s;
        int val;
        boolean valBool;
    @Before
    public void setUp() throws Exception {
        samplecheck= new IntegerSum();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void integerInput() throws Exception {
        // Arrange
      int arr[]={1, 2, 15, 5};
        // Act
        val = samplecheck.findSum(arr);
        // Assert
        assertEquals(23, val);

   samplecheck.findSum(arr);

    }

    @Test
    public void notInteger() throws Exception
    {   // Arrange
        float arr[]= {1.2f, 2, 3.5f};
        // Act
        valBool= samplecheck.notAnInteger(arr);
        // Assert
        assertFalse(valBool);
    }
}