public class PolaSegitigaBintang {
    public static void main(String[] args) {
        // Half Triangle
        System.out.println("Half Triangle");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // Full Triangle
        System.out.println("Full Triangle");
        for (int i = 1; i <= 5; i++) {
            int bintang = (i <= 3) ? 2 * i - 1 : 2 * (6 - i) - 1;
            int spasi = (5 - bintang) / 2;

            for (int s = 1; s <= spasi; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= bintang; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}