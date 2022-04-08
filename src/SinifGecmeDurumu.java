import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat, fizik, kimya, turkce, muzik;
        System.out.println("Ders not ortalaması hesaplamaya Hoşgeldiniz!");
        System.out.print("Sırasıyla ders notlarınızı giriniz: \nMatematik Notunuz: ");
        mat = input.nextDouble();
        if (mat < 0 || mat > 100) {
            mat = 0;
        }
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }
        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;
        if (avarage > 55){
            System.out.println("Tebrikler sınıfı geçtiniz...");
        } else {
            System.out.println("Yazık size. Kaldınız...");
        }


    }

}
