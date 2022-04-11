import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, total = 1, n, r, nTotal = 1, rTotal = 1, nrTotal = 1, result;
        System.out.print("Faktöriyelini öğrenmek istediğiniz sayıyı girin: ");
        num = input.nextInt();
        for (int i = 1; i <= num; i++) {
            total *= i;
        }
        System.out.println("Sonuç: " + total);
        System.out.println("Sırada Kombinasyon Hesaplama var.");
        System.out.println("N sayısının R sayısına kombinasyonu...");
        System.out.print("N sayısını giriniz: ");
        n = input.nextInt();
        System.out.print("R sayısını giriniz: ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++) {
            nTotal *= i;
        }
        for (int i = 1; i <= r; i++) {
            rTotal *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            nrTotal *= i;
        }
        result = nTotal / (rTotal * nrTotal);
        System.out.println("Kombinasyon sonucunuz: " + result);
    }
}
