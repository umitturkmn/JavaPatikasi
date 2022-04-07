import java.util.Scanner;

public class HipotenusHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dikKenar1,dikKenar2;
        double hipotenus;
        System.out.println("----------------------------------");
        System.out.println("---------Hipotenus Hesaplama------");
        System.out.println("Üçgenin dik kenarlarının uzunluklarını giriniz.");
        System.out.print("1. Dik Kenar: ");
        dikKenar1 = input.nextInt();
        System.out.print("2. Dik Kenar: ");
        dikKenar2 = input.nextInt();
        hipotenus = Math.sqrt((dikKenar1*dikKenar1)+(dikKenar2*dikKenar2));
        System.out.println("Hipotenusunuz: " + hipotenus);




    }
}
