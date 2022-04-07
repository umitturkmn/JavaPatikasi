import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,indeks;
        System.out.println("**********************************************");
        System.out.println("*******-Vücut Kitle İndeksi Hesaplama-********");
        System.out.println("**********************************************");
        System.out.print("Boyunuz(M): ");
        boy = input.nextDouble();
        System.out.print("Kilonuz(KG): ");
        kilo = input.nextDouble();
        indeks = kilo /(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);



    }
}
