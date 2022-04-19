import java.util.Arrays;
import java.util.Scanner;

public class DiziOrtalamasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, emp,counter=0;
        double result;
        System.out.print("Kaç elamanlı bir dizi istiyorsunuz: ");
        emp = input.nextInt();
        int[] simpleArray = new int[emp];
        for (int i = 0; i < emp; i++){
            counter++;
            System.out.print(counter + ". elamanı girin: ");
            int x = input.nextInt();
            simpleArray[i] = x;
        }
        System.out.print("Diziniz: ");
        System.out.println(Arrays.toString(simpleArray));

        for (int i = 0; i < simpleArray.length; i++) {
            sum += simpleArray[i];
        }
        result = sum / simpleArray.length;
        System.out.println("Dizinin Ortalaması: " + result);

    }
}
