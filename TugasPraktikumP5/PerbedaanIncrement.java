public class PerbedaanIncrement {
    public static void main(String[] args) {
        int i = 0;
        System.out.println("Pakai i++ :");
        while (i++ < 3) {
            System.out.println(i);
        }

        int j = 0;
        System.out.println("Pakai ++j :");
        while (++j < 3) {
            System.out.println(j);
        }
    }
}