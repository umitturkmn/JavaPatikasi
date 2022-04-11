import java.util.Scanner;

public class BasamakToplamaveArmSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, total = 0, arm, armB, counter = 0, armTotal = 0,result=1;
        System.out.println("Basamak toplama.");
        System.out.print("Sayı giriniz: ");
        a = input.nextInt();

        while (a != 0) {
            b = a % 10;
            total += b;
            a = a / 10;
        }
        System.out.println("Sayınızın basamakları toplamı: " + total);

        System.out.println("Armstrong Kontrol");
        System.out.print("Sayı Giriniz: ");
        arm = input.nextInt();
        while (arm != 0) {
            counter++;
            armB = arm %10;
            arm = arm / 10;

            for (int i = 0; i < counter; i++) {
                result*= armB;
            }
            armTotal += result;
        }
        if (result == arm){
            System.out.println("Sayınız bir Armstrong sayıdır.");
        } else{
            System.out.println("Sayınız Armstrong sayı değildir.");
        }



    }
}
