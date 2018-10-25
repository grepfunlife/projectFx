import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.AssertJUnit.assertEquals;

public class FTest {

    protected  ByteArrayOutputStream output;
    private PrintStream old;

    @BeforeTest
    public void setUpStreams() {
        old = System.out;
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
    }

    @AfterTest
    public void cleanUpStreams() {
        System.setOut(old);
    }

    @Test(dataProvider = "data-provider", dataProviderClass = Data.class)
    public void fTest(double x, String expResult) {
        Fx.fx(x);
        assertEquals(expResult, output.toString());
    }
}
