import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GajiPegawai {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Nomor Induk Karyawan (NIK) : ");
        String nik = br.readLine();
        System.out.print("Nama Karyawan              : ");
        String nama = br.readLine();
        System.out.print("Alamat                     : ");
        String alamat = br.readLine();
        System.out.print("Jabatan                    : ");
        String jabatan = br.readLine();

        double p1 = 2000000;  
        double p2 = 300000;   
        double p3 = 200000;   
        double p4 = 150000;   

        double totalGaji = p1 + p2 + p3 + p4;
        double pajak = 0.10 * (p1 + p2 + p3 + p4);
        double gajiBersih = totalGaji - pajak;

        System.out.println("\n===== SLIP GAJI =====");
        System.out.println("Nomor Induk Karyawan : " + nik);
        System.out.println("Nama Karyawan        : " + nama);
        System.out.println("Alamat               : " + alamat);
        System.out.println("Jabatan              : " + jabatan);
        System.out.printf("Gaji Pokok           : %.0f%n", p1);
        System.out.printf("Tunjangan Jabatan    : %.0f%n", p2);
        System.out.printf("Tunjangan Istri      : %.0f%n", p3);
        System.out.printf("Tunjangan Anak       : %.0f%n", p4);
        System.out.printf("Total Gaji           : %.0f%n", totalGaji);
        System.out.printf("Pajak Penghasilan    : %.0f%n", pajak);
        System.out.printf("Gaji Bersih          : %.0f%n", gajiBersih);
    }
}