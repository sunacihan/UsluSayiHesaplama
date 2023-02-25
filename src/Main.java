import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int toplam=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Üssü alınacak sayıyı giriniz:");
        int usalinacak=input.nextInt();
        System.out.print("Üssü giriniz:");
        int us=input.nextInt();

        for(int i=1; i<=us; i++){
            toplam*=usalinacak;
        }
        System.out.println("Cevap:"+toplam);
    }
}