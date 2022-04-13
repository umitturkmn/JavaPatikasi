import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Elmas Yap.");
        System.out.print("Satır Sayısını Giriniz(Sadece Elmasın Üst Tarafının Satır Sayısıdır.) :");
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int a = 1; a <= n - i; a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (i * 2) - 1; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = (n-1); i>=0; i--) {
            for (int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=(2*i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
