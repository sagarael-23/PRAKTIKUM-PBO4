import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerVSBufferedReader {
    public static void main(String[] args) throws IOException {
        // ===== 1. Scanner =====
        Scanner sc = new Scanner(System.in);
        System.out.print("[Scanner] Masukkan umur (angka): ");
        int umurScanner = sc.nextInt();          // langsung bisa baca tipe int
        sc.nextLine();                           
        System.out.print("[Scanner] Masukkan nama        : ");
        String namaScanner = sc.nextLine();
        System.out.println("Hasil Scanner        -> " + namaScanner + ", " + umurScanner + " tahun\n");

        // ===== 2. BufferedReader =====
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("[BufferedReader] Masukkan umur (angka): ");
        int umurBr = Integer.parseInt(br.readLine());   // harus di-parse manual
        System.out.print("[BufferedReader] Masukkan nama        : ");
        String namaBr = br.readLine();
        System.out.println("Hasil BufferedReader -> " + namaBr + ", " + umurBr + " tahun");
    }
}