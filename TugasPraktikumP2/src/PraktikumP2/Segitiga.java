package PraktikumP2;

public class Segitiga {
    public static void main(String[] args) {
        // Soal No 5: Luas Segitiga
        double a = 6; // tinggi
        double b = 8; // alas
        double luas = 0.5 * b * a;
        
        System.out.println("--- Soal 5: Luas Segitiga ---");
        System.out.println("Tinggi (a) = " + a + ", Alas (b) = " + b);
        System.out.println("Luas Segitiga = " + luas);
        
        System.out.println("\n--- Soal 6: Pythagoras & Keliling ---");
        // Soal No 6: Pythagoras mencari nilai c (sisi miring)
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("Nilai sisi miring (c) menggunakan Pythagoras = " + c);
        
        // Menghitung keliling
        double keliling = a + b + c;
        System.out.println("Keliling Segitiga = " + keliling);
    }
}