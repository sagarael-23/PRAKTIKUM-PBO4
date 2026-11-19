package P7;
class KelasThread extends Thread {
    private String nama;

    public KelasThread(String nama) {
        this.nama = nama;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(nama + " - hitungan ke-" + i);
        }
    }
}

public class BuatKelasThread {
    public static void main(String[] args) {
        KelasThread t = new KelasThread("Thread-Baru");
        t.start(); 
        System.out.println("Thread utama selesai dijalankan");
    }
}