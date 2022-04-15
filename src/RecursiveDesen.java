import java.util.Scanner;

public class RecursiveDesen {
    static int Desen(int x){
        if (x <1){
            System.out.print("-" + x);
            return Desen(x)+5;
        }
        if (x==x){
            System.out.print("-" + x);
            return x;
        }
        System.out.print("-" + x);
        return Desen(x)-5;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        System.out.print("Sayı girin: ");
        x = input.nextInt();
        System.out.println("Sayı: " + x);
        System.out.print("Çıktısı: " + Desen(x));

    }
}
