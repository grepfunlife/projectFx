import org.testng.annotations.DataProvider;

public class Data {

    @DataProvider(name = "data-provider")
    public static Object[][] dataProviderMethod() {
        return new Object[][]{
                {4, "0.25"},
                {0, "х не должен быть равен нулю"},
                {500.1, "х не может быть больше 500"},
                {-500.1, "х не может быть меньше -500"},
                {500, "0.002"},
                {-500, "-0.002"}
        };
    }
}