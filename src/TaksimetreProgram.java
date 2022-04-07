import java.util.Scanner;

public class TaksimetreProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,fiyat,odeme;
        boolean buyuk,kucuk;
        System.out.println("----------------------------------");
        System.out.println("-----------TAKSİMETRE-------------");
        System.out.println("----------------------------------");
        System.out.println("KM Başı Ücret: 2.20 Türk Lirasıdır.\nMinimum ödenecek ücret 20 Türk Lirasıdır.\nAçılış ücreti 10 Türk Lirasıdır.");
        System.out.print("Kaç KM gidildi: ");
        km = input.nextDouble();
        fiyat = (km * 2.2)+10;
        kucuk = fiyat <= 20;
        buyuk = fiyat > 20;
        if (fiyat <=20)
            System.out.println("Ödemeniz gereken ücret: " + 20);
        else
            System.out.println("Ödemeniz gereken ücret: " + fiyat);






    }
}
