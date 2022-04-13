import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number, result = 1, total, counter = 1; //11
        int nextCounter=0;


        System.out.println("Harmonik Sayı Serisi Gösteren Program...");
        System.out.print("Sayı giriniz: ");

        number = input.nextInt();
        System.out.println("Sayınızın Harmonik Serisi:");
        for (int i = 1; i <= number; i++) {
            counter++; nextCounter++;
            System.out.print(nextCounter+". sıra = "+ result + " - ");
            result += 1 / counter;
        }


    }
}
