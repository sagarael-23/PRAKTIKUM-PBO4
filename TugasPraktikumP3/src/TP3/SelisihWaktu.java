import java.util.Scanner;

public class SelisihWaktu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Waktu pertama:");
        System.out.print("  Jam   : "); int j1 = sc.nextInt();
        System.out.print("  Menit : "); int m1 = sc.nextInt();
        System.out.print("  Detik : "); int d1 = sc.nextInt();

        System.out.println("Waktu kedua:");
        System.out.print("  Jam   : "); int j2 = sc.nextInt();
        System.out.print("  Menit : "); int m2 = sc.nextInt();
        System.out.print("  Detik : "); int d2 = sc.nextInt();

        int detik1 = j1 * 3600 + m1 * 60 + d1;
        int detik2 = j2 * 3600 + m2 * 60 + d2;
        int selisih = Math.abs(detik2 - detik1);

        int jam = selisih / 3600;
        int menit = (selisih % 3600) / 60;
        int detik = selisih % 60;

        System.out.println("\nSelisih waktu: " + jam + " jam, " + menit + " menit, " + detik + " detik");
    }
}