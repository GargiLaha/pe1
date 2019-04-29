import com.stackroute.pe1.Checker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CheckerTest {

    Checker testcase;
    String str;

    @Before
    public void setUp() throws Exception {
        testcase=new Checker();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkjerry() {
        // Act
        str= testcase.tomjerry(26);
        // Assert
        assertEquals("Jerry",str);
    }

    @Test
    public void checkneithervalue() {
        // Act
        str= testcase.tomjerry(40);
        // Assert
        assertEquals("Neither Tom nor Jerry", str);
    }

    @Test
     public void checkstringinput() {
    // Act
    str=testcase.error_message("ag");
    // Assert
    assertEquals("enter int",str);
}

}