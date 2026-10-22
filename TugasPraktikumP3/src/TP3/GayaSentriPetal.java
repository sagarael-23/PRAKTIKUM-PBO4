import java.util.Scanner;

public class GayaSentriPetal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Massa benda (kg)         : ");
        double m = sc.nextDouble();
        System.out.print("Kecepatan (m/s)          : ");
        double v = sc.nextDouble();
        System.out.print("Jari-jari lintasan (m)   : ");
        double r = sc.nextDouble();

        double fc = (m * v * v) / r;   

        System.out.printf("Gaya sentripetal (Fc)    : %.2f N%n", fc);
    }
}