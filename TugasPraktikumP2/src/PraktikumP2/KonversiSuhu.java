package PraktikumP2;

public class KonversiSuhu {
    public static void main(String[] args) {
        double C = 10;
        double F = 15;
        double R = 5;
        
        System.out.println("--- a. Celcius ke Fahrenheit dan Sebaliknya ---");
        System.out.println(C + " Celcius = " + ((C * 9/5) + 32) + " Fahrenheit");
        System.out.println(F + " Fahrenheit = " + ((F - 32) * 5/9) + " Celcius");
        
        System.out.println("\n--- b. Celcius ke Reamur dan Sebaliknya ---");
        System.out.println(C + " Celcius = " + (C * 4/5) + " Reamur");
        System.out.println(R + " Reamur = " + (R * 5/4) + " Celcius");
        
        System.out.println("\n--- c. Fahrenheit ke Reamur dan Sebaliknya ---");
        System.out.println(F + " Fahrenheit = " + ((F - 32) * 4/9) + " Reamur");
        System.out.println(R + " Reamur = " + ((R * 9/4) + 32) + " Fahrenheit");
    }
}