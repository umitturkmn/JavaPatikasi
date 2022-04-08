import java.util.Scanner;

public class HesapMakinasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, toplama, cikarma, bolme, carpma;
        int secim;
        System.out.println("******************************");
        System.out.println("*******-HESAP MAKİNASI-*******");
        System.out.println("******************************");
        System.out.print("1. Sayıyı Giriniz: ");
        a = input.nextDouble();
        System.out.print("2. Sayıyı Giriniz: ");
        b = input.nextDouble();
        System.out.println("Yapmak istediğiniz işlemi seçin.\nToplama(1)\nÇıkarma(2)\nÇarpma(3)\nBölme(4)");
        System.out.print("Seçiminiz: ");
        secim = input.nextInt();


        switch (secim) {
            case 1:
                toplama = a + b;
                System.out.println("SONUÇ: " + toplama);
                break;
            case 2:
                cikarma = a - b;
                System.out.println("SONUÇ: " + cikarma);
                break;
            case 3:
                carpma = a * b;
                System.out.println("SONUÇ: " + carpma);
                break;
            case 4:
                bolme = a / b;
                System.out.println("SONUÇ: " + bolme);
                break;
            default:
                System.out.println("Hatalı tuşladınız...");
                break;
        }


    }
}
