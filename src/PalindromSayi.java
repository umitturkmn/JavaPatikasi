import java.util.Scanner;

public class PalindromSayi {
    static boolean isPalindrom(int number){
        int temp=number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Palindrom sayı kontrol.\nSayı giriniz: ");
        a = input.nextInt();
        if (isPalindrom(a) == true)
            System.out.println("Sayınız Palindrom sayıdır.");
        else
            System.out.println("Sayınız düz sayıdır.");
    }
}
