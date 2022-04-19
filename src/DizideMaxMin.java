import java.util.Arrays;
import java.util.Scanner;

public class DizideMaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, emp, counter = 0;
        double avarage;
        System.out.print("Kaç elamanlı bir dizi istiyorsunuz: ");
        emp = input.nextInt();
        int[] simpleArray = new int[emp];
        for (int i = 0; i < emp; i++) {
            counter++;
            System.out.print(counter + ". elamanı girin: ");
            int x = input.nextInt();
            simpleArray[i] = x;
        }
        System.out.print("Diziniz: ");
        System.out.println(Arrays.toString(simpleArray));
        Arrays.sort(simpleArray);
        System.out.println("Minimum Değer: " + simpleArray[0]);
        System.out.println("Maksimum Değer: " + simpleArray[simpleArray.length-1]);


    }
}
