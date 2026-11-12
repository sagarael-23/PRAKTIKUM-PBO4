import java.util.Scanner;

public class JumlahAngkaGanjil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak angka : ");
        int n = input.nextInt();

        int ganjil = 1;
        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(ganjil + " ");
            total += ganjil;
            ganjil += 2;
        }

        System.out.println();
        System.out.println("Total penjumlahan : " + total);
    }
}