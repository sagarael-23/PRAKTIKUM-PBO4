import java.util.Scanner;

public class PercetakanNovel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Banyaknya novel yang dicetak : ");
        long jumlahNovel = sc.nextLong();
        System.out.print("Tebal per novel (lembar)     : ");
        long tebal = sc.nextLong();

        long totalLembar = jumlahNovel * tebal;
        long totalDetik = totalLembar;        // kecepatan 1 lembar/detik

        long hari = totalDetik / 86400;
        long sisa = totalDetik % 86400;
        long jam = sisa / 3600;
        sisa = sisa % 3600;
        long menit = sisa / 60;
        long detik = sisa % 60;

        System.out.println("\nTotal lembar : " + totalLembar);
        System.out.println("Waktu cetak  : " + hari + " hari, " + jam + " jam, "
                + menit + " menit, " + detik + " detik");
    }
}