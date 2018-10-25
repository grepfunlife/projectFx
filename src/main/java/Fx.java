import static java.lang.System.*;

public class Fx {

    public static void fx(double x) {
        double f;
        if (x == 0) {
            out.print("х не должен быть равен нулю");
        } else if (x > 500) {
            out.print("х не может быть больше 500");
        } else if (x < -500) {
            out.print("х не может быть меньше -500");
        } else {
            f = 1/ x;
            out.print(f);
        }
    }
}
