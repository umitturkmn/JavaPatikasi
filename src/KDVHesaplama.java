import java.util.Scanner;

public class KDVHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fiyat,vergisi,vergili;
        boolean buyuk,kucuk;
        System.out.println("Katma Değer Vergisi Hesaplama Programı...");
        System.out.print("-----------------------------------------\nKDV yüzde 18 olarak hesaplanacaktır.\n");
        System.out.print("Lütfen hesaplamak istediğiniz ürünün Fiyatını giriniz:");
        fiyat = input.nextDouble();
        buyuk = fiyat >= 1000;
        kucuk = fiyat >= 0;
        vergisi = buyuk && kucuk ? (fiyat*8)/100 : (fiyat*18)/100;
        vergili = fiyat + vergisi;
        System.out.println("KDV'siz Fiyatı: " + fiyat);
        System.out.println("KDV tutarı: " + vergisi);
        System.out.println("KDV'li Fiyatı: " + vergili);
        System.out.println("-----------------------------------------");


    }
}
