import java.util.Scanner;

public class DaireHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim; double r,alan,cevre,pi=3.14,a;
        System.out.println("******************************");
        System.out.println("*****Daire Alan Hesaplama*****");
        System.out.println("******************************");
        System.out.println("Yapmak istediğiniz işlemi seçiniz.\nAlan ve Çevre Hesabı(1)\nDaire Diliminin Hesabı(2)");;
        System.out.print("Seçiminiz:");
        secim = input.nextInt();
        if (secim == 1)
            System.out.println("Pi sayısı 3.14 olarak alınacaktır.");
            System.out.print("Dairenin Yarıçapını(r) giriniz: ");
            r = input.nextDouble();
            alan = pi * r * r;
            cevre = 2 * pi * r;
            System.out.println("Dairenizin alanı: " + alan);
            System.out.println("Dairenizin çevresi: " + cevre);

        if (secim == 2)
            System.out.println("Pi sayısı 3.14 olarak alınacaktır.");
            System.out.print("Dairenin Yarıçapını(r) giriniz: ");
            r = input.nextDouble();
            System.out.print("Merkez açısını girin: ");
            a = input.nextDouble();
            alan = (pi * (r * r) * a) / 360;
            System.out.println("İlgili açının alanı: " + alan);

    }
}
