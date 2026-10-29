package P4;
import java.util.Scanner;

public class Kasir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Apakah memiliki kartu member? (y/n): ");
        String member = input.next();
        System.out.print("Masukkan total belanja: Rp");
        double belanja = input.nextDouble();
        
        double diskon = 0;
        
        if (member.equalsIgnoreCase("y")) {
            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanja > 100000) {
                diskon = 10000;
            }
        }
        
        double totalBayar = belanja - diskon;
        System.out.println("Diskon yang didapat: Rp" + diskon);
        System.out.println("Total yang harus dibayar: Rp" + totalBayar);
        
        System.out.print("Masukkan uang yang diberikan: Rp");
        double uangDiberikan = input.nextDouble();
        
        double kembalian = uangDiberikan - totalBayar;
        System.out.println("Kembalian: Rp" + kembalian);
    }
}