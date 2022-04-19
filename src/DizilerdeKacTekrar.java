import java.util.Arrays;
import java.util.Scanner;

public class DizilerdeKacTekrar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0, index = 0, emp, counter = 0;
        double avarage;
        System.out.print("Kaç elamanlı bir dizi istiyorsunuz: ");
        emp = input.nextInt();
        int[] simpleArray = new int[emp];
        int[] repetitive = new int[emp];
        for (int i = 0; i < emp; i++) {
            counter++;
            System.out.print(counter + ". elamanı girin: ");
            int x = input.nextInt();
            simpleArray[i] = x;
        }
        System.out.print("Diziniz: ");
        System.out.println(Arrays.toString(simpleArray));

        for (int i = 0; i < simpleArray.length; i++) {
            for (int j = 0; j < simpleArray.length; j++) {
                if (i != j && simpleArray[i] == simpleArray[j]) {
                    counter++;
                }
                if (isFind(repetitive,simpleArray[i]) == false){
                    repetitive[index++] = simpleArray[i];
                    System.out.println(simpleArray[i] + " sayisi " + counter + " kere tekrar edildi");
                    counter = 0;
                }


            }
        }
    }

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value)
                return true;
        }
        return false;

    }
}

