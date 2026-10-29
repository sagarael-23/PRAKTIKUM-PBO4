package P4;

import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan Kode Golongan (1-4): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Jumlah Anak: ");
        int jumlahAnak = input.nextInt();
        
        double gajiPokok = 0;
        
        switch (golongan) {
            case 1: gajiPokok = 1200000; break; // Menikah
            case 2: gajiPokok = 1500000; break; // Belum Menikah
            case 3: gajiPokok = 1750000; break; // Cerai
            case 4: gajiPokok = 2000000; break; // Menikah dan punya anak
            default: System.out.println("Golongan tidak valid."); return;
        }
        
        double tunjanganPasangan = 0;
        if (golongan == 1 || golongan == 4) {
            tunjanganPasangan = 0.10 * gajiPokok;
        }
        
        double tunjanganAnak = 0.05 * gajiPokok * jumlahAnak;
        double totalTunjangan = tunjanganPasangan + tunjanganAnak;
        double gajiBersih = gajiPokok + totalTunjangan;
        
        System.out.println("\n--- Rincian Gaji ---");
        System.out.println("Nama: " + nama + " (NIK: " + nik + ")");
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
        System.out.println("Tunjangan Pasangan: Rp" + tunjanganPasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Total Gaji Bersih: Rp" + gajiBersih);
    }
}