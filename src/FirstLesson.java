import java.util.Scanner;

public class FirstLesson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Merhaba Dünya!");
        System.out.println("Başlıyoruz.");
        System.out.print("Ümit Türkmen\nAdamdır.\n");
        //Ümit bu günleri özleyecek...
        //Umut et.
        //Bir gün idealarını gerçekleştireceksin.
        //Biiznillah...


        int numberOne = 10, numberTwo;
        System.out.println(numberOne);
        numberTwo = 33;
        System.out.print("Toplam: \n");
        System.out.print(numberOne+numberTwo);

        int a;
        System.out.print("Lütfen sayı giriniz: ");
        a = input.nextInt();
        System.out.println("Sayınız: " + a);

    }
}
