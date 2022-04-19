import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


public class SayiBul {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int number = rnd.nextInt(100), prediction = 0, counter = 5, wrongCounter = 5;
        System.out.println("Toplam 5 hakkınız vardır.");
        while (counter > 0){
            System.out.print("1-100 arası olan sayıyı tahmin edin:");
            prediction = input.nextInt();
            if (prediction < 0 && prediction > 100) {
                System.out.println("Sadece 1 ve 100 arası sayı girebilirsiniz.Hatalı giriş yaptınız. " + wrongCounter + "hakkınız kaldı.");
                wrongCounter--;
                if (wrongCounter == 0) {
                    System.out.println("Yeteri kadar hata yaptınız. Hoşçakalın...");
                    break;
                }
            }
            if (prediction == number) {
                System.out.println("------------------------------");
                System.out.println("Tebrikler sayıyı buldunuz...");
                System.out.println("Tahminiz: " + prediction);
                System.out.println("Sayı: " + number);
            }
            if (prediction < number) {
                System.out.println("------------------------------");
                System.out.println("Daha yüksek bir sayı giriniz...");
                System.out.println("Tahminiz: " + prediction);
                System.out.println("Kalan deneme hakkınız: " + counter);
                counter--;
            }
            if (prediction > number) {
                System.out.println("------------------------------");
                System.out.println("Daha küçük bir sayı giriniz...");
                System.out.println("Tahminiz: " + prediction);
                System.out.println("Kalan deneme hakkınız: " + counter);
                counter--;
            }
        }


    }
}
