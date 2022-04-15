import java.util.Scanner;

public class RecursiveAsal {
    static boolean isAsal(int x) {
        int counter = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0)
                counter++;
        }
        if (counter<2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.println("Asal sayı kontrol");
        System.out.print("Sayı giriniz: ");
        x = input.nextInt();
        if (isAsal(x)==true)
            System.out.println("Sayınız asaldır.");
        else
            System.out.println("Sayınız asal değildir.");
    }
}
