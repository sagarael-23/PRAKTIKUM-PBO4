import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuahIbuSisca {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Jumlah mangga dibeli (pcs)          : ");
        int mangga = Integer.parseInt(br.readLine());          
        System.out.print("Jumlah tetangga                     : ");
        int tetangga = Integer.parseInt(br.readLine());       
        System.out.print("Jambu per tetangga (pcs)            : ");
        int jambuPerOrang = Integer.parseInt(br.readLine());   
        System.out.print("Mangga busuk (dikembalikan) (pcs)   : ");
        int busuk = Integer.parseInt(br.readLine());           

        int jambu = tetangga * jambuPerOrang;     
        int manggaBersih = mangga - busuk;        
        int totalBuah = manggaBersih + jambu;     

        System.out.println("\nJumlah jambu            : " + jambu + " pcs");
        System.out.println("Mangga yang dibeli (bersih): " + manggaBersih + " pcs");
        System.out.println("Total buah yang dibeli  : " + totalBuah + " pcs");
    }
}