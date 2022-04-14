import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 0;
        System.out.println("1 ve 100 arasındaki asal sayılar: ");
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < 100; j++)
                if (i % j == 0)
                    counter++;
            if (counter < 2)
                if (i !=97)
                System.out.print(i + "-");
                else
                    System.out.println(i);
            counter = 0;
        }
    }
}

