import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FTest {

    @Test(dataProvider = "data-provider", dataProviderClass = Data.class)
    public void successTest(double x, String expResult) {
        String result = Fx.fx(x);
        assertEquals(result, expResult);
    }
}
