import java.util.Scanner;

public class NotOrtalamasiProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mat,fizik,kimya,turkce,muzik,tarih,ort;
        System.out.println("Ders not ortalaması hesaplamaya Hoşgeldiniz!");
        System.out.print("Sırasıyla ders notlarınızı giriniz: \nMatematik Notunuz: ");
        mat = input.nextDouble();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextDouble();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextDouble();
        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextDouble();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextDouble();
        System.out.print("Tarih Notunuz: ");
        tarih = input.nextDouble();

        ort = (mat + fizik + kimya + turkce + muzik + tarih)/6;
        System.out.print("Toplam not ortalamanız: " + ort);







    }
}
