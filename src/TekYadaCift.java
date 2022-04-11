import java.util.Scanner;

public class TekYadaCift {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,total=0;
        System.out.println("Negatif bir sayı girene kadar sayı isteyeceğiz. Girdiğiniz sayıların 4 ve 2'nin katlarını toplayacağız.");
        do {
            System.out.print("Sayı giriniz: ");
            a = input.nextInt();
            if ((a % 4 == 0|| a % 2 == 0)&&(a>0)){
                total += a;
            }
        } while (a > 0);
        System.out.println("Toplam: " + total);






    }
}
