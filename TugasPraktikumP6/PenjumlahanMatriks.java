package P7;

import java.util.Scanner;

public class PenjumlahanMatriks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah baris   : ");
        int baris = input.nextInt();
        System.out.print("Masukkan jumlah kolom   : ");
        int kolom = input.nextInt();

        int[][] a = new int[baris][kolom];
        int[][] b = new int[baris][kolom];
        int[][] hasil = new int[baris][kolom];

        System.out.println("Isi matriks A:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Isi matriks B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print("B[" + i + "][" + j + "] = ");
                b[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Hasil penjumlahan A + B:");
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }
}