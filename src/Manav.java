import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut=2.14,elma=3.67,domates=1.11,muz=0.95,patlıcan=5,a,b,c,d,e,toplam;
        System.out.println("**************************");
        System.out.println("*********-MANAV-**********");
        System.out.println("**************************");
        System.out.println("Meyveler ve KG Fiyatları");
        System.out.println("Armut : 2,14 TL");
        System.out.println("Elma : 3,67 TL");
        System.out.println("Domates : 1,11 TL");
        System.out.println("Muz: 0,95 TL");
        System.out.println("Patlıcan : 5,00 TL");
        System.out.println("**************************");
        System.out.println("**************************");
        System.out.print("Armut Kaç Kilo ? : ");
        a = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        b = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        c = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        d = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        e = input.nextDouble();
        toplam = (a*armut)+(b*elma)+(c*domates)+(d*muz)+(e*patlıcan);
        System.out.println("Toplam Ödemeniz Gereken Ücret: " + toplam + " Türk Lirasıdır.");


    }
}
