import java.io.*;
import java.util.Scanner;

public class belanja {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama         : ");
        String nama = sc.nextLine();
        System.out.print("Total Belanja: ");
        double belanja = sc.nextDouble();
        System.out.print("Diskon (%)   : ");
        double diskon = sc.nextDouble();

        double total = belanja - (belanja * diskon / 100);

        System.out.print("Bayar        : ");
        double bayar = sc.nextDouble();
        double kembali = bayar - total;

        DataOutputStream dos = new DataOutputStream(new FileOutputStream("belanja.dat"));
        dos.writeUTF(nama);
        dos.writeDouble(belanja);
        dos.writeDouble(diskon);
        dos.writeDouble(total);
        dos.writeDouble(bayar);
        dos.writeDouble(kembali);
        dos.close();

        DataInputStream dis = new DataInputStream(new FileInputStream("belanja.dat"));
        String rNama = dis.readUTF();
        double rBelanja = dis.readDouble();
        double rDiskon = dis.readDouble();
        double rTotal = dis.readDouble();
        double rBayar = dis.readDouble();
        double rKembali = dis.readDouble();
        dis.close();

        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("Nama          : " + rNama);
        System.out.printf("Total Belanja : %.0f%n", rBelanja);
        System.out.printf("Diskon (%%)    : %.0f%n", rDiskon);
        System.out.printf("Total         : %.0f%n", rTotal);
        System.out.printf("Bayar         : %.0f%n", rBayar);
        System.out.printf("Kembalian     : %.0f%n", rKembali);
    }
}