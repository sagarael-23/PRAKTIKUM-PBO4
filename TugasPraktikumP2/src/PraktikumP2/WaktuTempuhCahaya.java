package PraktikumP2;

public class WaktuTempuhCahaya {
    public static void main(String[] args) {
        double jarakBumiBulan = 384400; // dalam km
        double jarakMatahari = 152100000; // 152.1 juta km
        double kecepatanCahaya = 300000; // km/s
        
        double waktuKeBulan = jarakBumiBulan / kecepatanCahaya;
        double waktuKeMatahari = jarakMatahari / kecepatanCahaya;
        
        System.out.println("Waktu tempuh cahaya dari Bumi ke Bulan: " + waktuKeBulan + " detik");
        System.out.println("Waktu tempuh cahaya dari Bumi ke Matahari: " + waktuKeMatahari + " detik");
    }
}