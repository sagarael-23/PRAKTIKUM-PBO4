import java.util.Scanner;

public class JumlahDanRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa bilangan yang akan dimasukkan : ");
        int n = input.nextInt();

        int total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + " : ");
            total += input.nextInt();
        }

        double rataRata = (double) total / n;

        System.out.println("Total jumlah : " + total);
        System.out.println("Rata-rata    : " + rataRata);
    }
}