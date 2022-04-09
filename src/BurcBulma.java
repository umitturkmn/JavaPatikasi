import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int month,day; String result;
        System.out.println("Burç Bulma Programı\nDoğduğunu tarihlerinizi girmeniz yeterli olacaktır.");
        System.out.print("Doğum ayınız: ");
        month = input.nextInt();
        System.out.print("Doğum gününüz: ");
        day = input.nextInt();

        switch (month){
            case 1:
                System.out.println(day <= 21 ? "Oğlak Burcusunuz." : "Kova Burcusunuz.");
            case 2:
                System.out.println(day <= 19 ? "Kova Burcusunuz." : "Balık Burcusunuz.");
            case 3:
                System.out.println(day <= 20 ? "Balık Burcusunuz." : "Koç Burcusunuz.");
            case 4:
                System.out.println(day <= 20 ? "Koç Burcusunuz." : "Boğa Burcusunuz.");
            case 5:
                System.out.println(day <= 21 ? "Boğa Burcusunuz." : "İkizler Burcusunuz.");
            case 6:
                System.out.println(day <= 22 ? "İkizler Burcusunuz." : "Yengeç Burcusunuz.");
            case 7:
                System.out.println(day <= 22 ? "Yengeç Burcusunuz." : "Aslan Burcusunuz.");
            case 8:
                System.out.println(day <= 22 ? "Aslan Burcusunuz." : "Başak Burcusunuz.");
            case 9:
                System.out.println(day <= 22 ? "Başak Burcusunuz." : "Terazi Burcusunuz.");
            case 10:
                System.out.println(day <= 22 ? "Terazi Burcusunuz." : "Akrep Burcusunuz.");
            case 11:
                System.out.println(day <= 22 ? "Akrep Burcusunuz." : "Yay Burcusunuz.");
            case 12:
                System.out.println(day <= 21 ? "Yay Burcusunuz." : "Oğlak Burcusunuz.");
        }






    }
}
