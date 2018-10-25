import java.util.Scanner;
import static java.sql.DriverManager.println;

public class MainClass {

    public static void main(String[] args) {
        double x = 0;
        Scanner in = new Scanner(System.in);
        println("Введите x: ");
        x = in.nextInt();
        Fx.fx(x);
    }
}