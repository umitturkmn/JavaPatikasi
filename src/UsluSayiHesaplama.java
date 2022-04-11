import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,total=1;
        System.out.println("Üslü sayı hesaplama.");
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        a = input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz: ");
        b = input.nextInt();

        for (int i = 1; i <= b;i++){
            total *= a;
        }

        System.out.println("Sonuç: " + total);
    }
}
