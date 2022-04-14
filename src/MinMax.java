import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, counter = 0, numbers, max = 0, min = 0;
        System.out.print("Kaç tane sayı girmek istiyorsunuz: ");
        num = input.nextInt();

        for (int i = 0; i < num; i++) {
            counter++;
            System.out.print(counter + ". sayıyı giriniz: ");
            numbers = input.nextInt();
            if (numbers > min && numbers > max) {
                max = numbers;
                if (min == 0) {
                    min = numbers;
                }
            }
            if (numbers < max && numbers < min) {
                min = numbers;
                if (max == 0){
                    max = numbers;
                }
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
