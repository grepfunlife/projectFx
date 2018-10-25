import org.testng.annotations.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import static org.testng.AssertJUnit.assertEquals;

public class FTest {

    protected  ByteArrayOutputStream output;
    private PrintStream old;

    //здесь я подменяю поток вывода в консоль на свой перед запуском теста с очередным набором данных
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

    //Тут я осознаю, что тест ловит не тот эксепшен, который хотелось бы, но сделала, как пример того, что так можно делать )
    @Test(expectedExceptions = Exception.class)
    public void ExTest() {
        Double x = Double.valueOf("rr");
        Fx.fx(x);
    }
}
