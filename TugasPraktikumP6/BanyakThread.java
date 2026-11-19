package P7;

import java.util.Scanner;

public class BanyakThread {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Thread utama: " + Thread.currentThread().getName());
        System.out.print("Masukkan jumlah thread yang diinginkan: ");
        int jumlah = input.nextInt();

        Thread[] daftar = new Thread[jumlah];

        for (int i = 0; i < jumlah; i++) {
            final int nomor = i + 1;
            daftar[i] = new Thread(() -> {
                System.out.println("Halo dari thread anak ke-" + nomor
                        + " (nama: " + Thread.currentThread().getName() + ")");
            });
            daftar[i].start();
        }

        for (Thread t : daftar) {
            try {
                t.join();
            } catch (InterruptedException e) {
                System.out.println("Thread terganggu: " + e.getMessage());
            }
        }

        System.out.println("Semua " + jumlah + " thread anak selesai. Thread utama selesai.");
    }
}