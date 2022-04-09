import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.println("Artık yıl kontrol etme programı.");
        System.out.print("Yıl giriniz: ");
        year = input.nextInt();
        System.out.println(year % 4 == 0 ?  "Yılınız artıktır." : "Yılınız artık değildir.");

    }
}
