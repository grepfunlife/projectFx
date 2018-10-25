import java.util.Scanner;
import static java.lang.System.*;

public class MainClass {

    public static void main(String[] args) {
        double x;
        Scanner in = new Scanner(System.in);
        out.print("Введите x: ");
        x = in.nextInt();
        Fx.fx(x);
    }
}