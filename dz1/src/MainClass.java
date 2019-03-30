import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
        System.out.println("введите первое число для проверки");
        int a=scanner.nextInt();
        System.out.println("введите второе число для проверки");
        int b=scanner.nextInt();
        if (ifSumm1020(a,b) ==true)
            System.out.println("Сумма чисел лежит в диапазоне от 10 до 20");
        else System.out.println("Сумма чисел не лежит в диапазоне от 10 до 20");

    }

    public static double calculate(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }
    public static boolean ifSumm1020 (int a, int b){
        boolean result = false;
        if (a+b >=10 && a+b <=20) {
            result=true;
        }
        else result=false;
        return result;
    }
}