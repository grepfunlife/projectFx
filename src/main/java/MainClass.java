import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        double x = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите x: ");
        x = in.nextInt();
        Fx.fx(x);
    }
}