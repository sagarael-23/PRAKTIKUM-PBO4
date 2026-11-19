package P7;

import java.util.Arrays;
import java.util.Scanner;

public class ProgramArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + i + ": ");
            data[i] = input.nextInt();
        }

        int maks = data[0], idxMaks = 0;
        int min = data[0], idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (data[i] > maks) { maks = data[i]; idxMaks = i; }
            if (data[i] < min)  { min = data[i];  idxMin = i; }
        }
        System.out.println("Nilai terbesar: " + maks + " (indeks " + idxMaks + ")");
        System.out.println("Nilai terkecil: " + min + " (indeks " + idxMin + ")");

        int total = 0;
        for (int x : data) total += x;
        double rata = (double) total / n;
        System.out.println("Jumlah semua elemen: " + total);
        System.out.println("Rata-rata: " + rata);

        System.out.print("Masukkan digit terakhir NPM kamu: ");
        int npm = input.nextInt();
        int hasil = 0;
        if (npm % 2 == 0) {
            for (int i = 1; i < n; i += 2) hasil += data[i];
            System.out.println("NPM genap -> jumlah elemen berindeks ganjil: " + hasil);
        } else {
            for (int i = 0; i < n; i += 2) hasil += data[i];
            System.out.println("NPM ganjil -> jumlah elemen berindeks genap: " + hasil);
        }

        if (hasil % 2 == 0) {
            System.out.println("Hasil penjumlahan " + hasil + " bernilai genap");
        } else {
            System.out.println("Hasil penjumlahan " + hasil + " bernilai ganjil");
        }

        // h. Urutkan array
        Arrays.sort(data);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(data));
    }
}