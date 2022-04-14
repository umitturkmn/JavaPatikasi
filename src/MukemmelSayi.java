import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,kalan=0;
        System.out.println("Mükemmel Sayı Kontrol");
        System.out.println("Bir sayı girin: ");
        num = input.nextInt();
        for (int i = num-1; i > 0; i--) {
            if(num%i==0){
                kalan += i;
            }
        }
        if (num == kalan){
            System.out.println("Sayınız MÜKEMMELDİR.");
        } else {
            System.out.println("Sayısınız MÜKEMMEL DEĞİLDİR.");
        }


    }
}
