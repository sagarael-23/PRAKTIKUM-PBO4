package PraktikumP2;

public class OperatorIncrement {
    public static void main(String[] args) {
        int nilai = 5;
        System.out.println("Nilai awal: " + nilai);
        
        nilai++; // Post-increment
        System.out.println("Setelah nilai++ : " + nilai);
        
        ++nilai; // Pre-increment
        System.out.println("Setelah ++nilai : " + nilai);
    }
}