import org.testng.annotations.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class FTest {

    protected  ByteArrayOutputStream output;
    private PrintStream old;

    @BeforeMethod
    public void setUpStreams() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterMethod
    public void cleanUpStreams() {
        System.setOut(old);
    }

    @Test(dataProvider = "data-provider", dataProviderClass = Data.class)
    public void fTest(double x, String expResult) {
        Fx.fx(x);
        assertEquals(expResult, output.toString());
    }
}
