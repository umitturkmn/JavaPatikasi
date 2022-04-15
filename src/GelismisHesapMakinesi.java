import java.util.Scanner;

public class GelismisHesapMakinesi {
    static void Menu() {
        System.out.println("1- Toplama İşlemi");
        System.out.println("2- Çıkarma İşlemi");
        System.out.println("3- Çarpma İşlemi");
        System.out.println("4- Bölme işlemi");
        System.out.println("5- Üslü Sayı Hesaplama");
        System.out.println("6- Faktoriyel Hesaplama");
        System.out.println("7- Mod Alma");
        System.out.println("8- Dikdörtgen Alan ve Çevre Hesabı");
        System.out.println("0- Çıkış");
    }
    static void plus() {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("1. Sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        y = input.nextInt();
        System.out.println(x + "+" + y + "=" + (x + y));

    }
    static void minus() {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("1. Sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        y = input.nextInt();
        System.out.println(x + "+" + y + "=" + (x - y));
    }
    static void times() {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("1. Sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        y = input.nextInt();
        System.out.println(x + "+" + y + "=" + (x * y));
    }
    static void divided() {
        Scanner input = new Scanner(System.in);
        double x, y;
        System.out.print("1. Sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("2. Sayıyı giriniz: ");
        y = input.nextInt();
        System.out.println(x + "+" + y + "=" + (x / y));
    }
    static void power() {
        Scanner input = new Scanner(System.in);
        int base, out, result = 1;
        System.out.print("Taban: ");
        base = input.nextInt();
        System.out.print("Üs: ");
        out = input.nextInt();
        for (int i = 1; i <= out; i++) {
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }
    static void fact() {
        Scanner input = new Scanner(System.in);
        int x, result = 1;
        System.out.print("Sayı girin: ");
        x = input.nextInt();
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }
    static void mod() {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Sayı girin: ");
        x = input.nextInt();
        System.out.print("Mod sayısını giriniz: ");
        y = input.nextInt();
        System.out.println("Sonuç: " + (x % y));
    }
    static void rectangle() {
        Scanner input = new Scanner(System.in);
        int x, y;
        System.out.print("Kısa Kenar Uzunluğu giriniz: ");
        x = input.nextInt();
        System.out.print("Uzun Kenar Uzunluğu giriniz: ");
        y = input.nextInt();
        System.out.println("Çevresi: " + (2 * (x + y)));
        System.out.println("Alanı: " + (x * y));
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;
        System.out.println("*****************************");
        System.out.println("**-Gelişmiş Hesap Makinesi-**");
        System.out.println("*****************************");
        do {
            Menu();
            System.out.print("Seçiminiz: ");
            select = input.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    fact();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}
