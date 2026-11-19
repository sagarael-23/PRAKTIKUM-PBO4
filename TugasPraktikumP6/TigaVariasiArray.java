package P7;

public class TigaVariasiArray {
    public static void main(String[] args) {
        int[] a;
        a = new int[3];
        a[0] = 10;
        a[1] = 20;
        a[2] = 30;

        int[] b = {1, 2, 3};

        int[] c = new int[]{5, 6, 7};

        System.out.println("Array a: " + a[0] + ", " + a[1] + ", " + a[2]);
        System.out.println("Array b: " + b[0] + ", " + b[1] + ", " + b[2]);
        System.out.println("Array c: " + c[0] + ", " + c[1] + ", " + c[2]);
    }
}