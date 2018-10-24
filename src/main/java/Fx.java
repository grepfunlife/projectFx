public class Fx {

    public static String fx(double x) {
        double f = 0;
        String result = null;
        if (x == 0) {
            result = "х не должен быть равен нулю";
        } else if (x > 500) {
            result = "х не может быть больше 500";
        } else if (x < (-500)) {
            result = "х не может быть меньше -500";
        } else {
            f = 1 / x;
            result = Double.toString(f);
        }
        System.out.println(result);
        return result;
    }
}
