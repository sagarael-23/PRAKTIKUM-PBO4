package P7;

public class UbahNilaiArray {
    public static void main(String[] args) {
        String[] mobil = {"Tesla", "Suzuki", "Civic", "Mazda", "BMW"};

        int indeksUbah = -1;
        for (int i = 0; i < mobil.length; i++) {
            if (mobil[i].equals("Suzuki")) {
                indeksUbah = i;
                break;
            }
        }

        if (indeksUbah != -1) {
            mobil[indeksUbah] = "Toyota";
            System.out.println("Indeks " + indeksUbah + " sekarang berisi: " + mobil[indeksUbah]);
        }

        System.out.println("Isi array sekarang:");
        for (int i = 0; i < mobil.length; i++) {
            System.out.println("Indeks " + i + ": " + mobil[i]);
        }
    }
}