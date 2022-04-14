import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        int n1, n2, ebob = 1,ekok =1;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        n2 = input.nextInt();
        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB: " + ebob);
        } else {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
            }
            System.out.println("EBOB: " + ebob);
        }
        ekok = (n1*n2)/ebob;
        System.out.println("EKOK: " + ekok);
    }
}
