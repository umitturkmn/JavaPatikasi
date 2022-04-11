import java.util.Scanner;

public class GirilenSayiyaKadar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Bir sayı girin ve ona kadar olan çift sayıları verelim...");
        System.out.print("Bir sayı girin: ");
        a = input.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan çift sayılar.");
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                if (i != a - 2) {
                    System.out.print(i + "-");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
