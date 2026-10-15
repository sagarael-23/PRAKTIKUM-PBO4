package PraktikumP2;

public class OperasiMatematika {
    public static void main(String[] args) {
        int x = 22;
        int y = 33;
        
        System.out.println("Nilai x = " + x + ", y = " + y);
        System.out.println("Penjumlahan (x + y) = " + (x + y));
        System.out.println("Pengurangan (x - y) = " + (x - y));
        System.out.println("Perkalian (x * y) = " + (x * y));
        // Menggunakan double agar hasil pembagian desimal terlihat
        System.out.println("Pembagian (x / y) = " + ((double) x / y)); 
    }
}