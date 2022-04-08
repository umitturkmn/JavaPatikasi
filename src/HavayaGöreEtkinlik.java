import java.util.Scanner;

public class HavayaGöreEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik;
        System.out.print("Havaya Göre Etkinlik Önerme\nHava kaç derece?: ");
        sicaklik = input.nextDouble();

        if (sicaklik < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >=5 && sicaklik <15){
            System.out.println("Sinemaya gidebilirsiniz.");
        } if (sicaklik>=10 && sicaklik<25){
            System.out.println("Piknik yapabilirsiniz.");
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}
