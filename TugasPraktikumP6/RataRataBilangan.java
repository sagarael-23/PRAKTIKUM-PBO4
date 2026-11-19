package P7;

import java.util.Scanner;

public class RataRataBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = 0;
        while (true) {
            try {
                System.out.print("Masukkan banyak bilangan: ");
                n = Integer.parseInt(input.nextLine());
                if (n <= 0) {
                    System.out.println("Jumlah harus lebih dari 0!");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: input harus berupa bilangan bulat!");
            }
        }

        double[] data = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            while (true) {
                try {
                    System.out.print("Masukkan bilangan ke-" + (i + 1) + ": ");
                    data[i] = Double.parseDouble(input.nextLine());
                    break; // valid, lanjut ke bilangan berikutnya
                } catch (NumberFormatException e) {
                    System.out.println("Error: yang kamu masukkan bukan bilangan, coba lagi!");
                }
            }
            total += data[i];
        }

        System.out.println("Rata-rata = " + (total / n));
    }
}