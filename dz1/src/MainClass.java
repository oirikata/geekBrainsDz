public class MainClass {

    public static void main(String[] args) {
        byte bt = 1;
        short sh = 1;
        int i = 1;
        long lg = 1;
        float fl = 10.3f;
        double db = 10.5;
        char ch = 15;
        boolean bl = true;
        String str = "DZ #1";
        System.out.println(calculate(5, 4, 10, 3));

    }

    public static double calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
}