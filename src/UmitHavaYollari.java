import java.util.Scanner;

public class UmitHavaYollari {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perKm = 0.1, finPrice;
        int km, age, tripType;
        String nameSurname;
        System.out.println("*************************************");
        System.out.println("*********-ÜMİT HAVA YOLLARI-*********");
        System.out.println("***********-HOŞGELDİNİZ-*************");
        System.out.println("*************************************");
        System.out.println("Bilet fiyatı öğrenme programı.");
        System.out.print("Lütfen ad soyad giriniz: ");
        nameSurname = input.nextLine();
        System.out.print("Lütfen yaşınızı giriniz: ");
        age = input.nextInt();
        System.out.print("Lütfen kaç KM yol gidileceğini giriniz: ");
        km = input.nextInt();
        System.out.print("Yolculuk tipini seçiniz.\nTek Yön(1)-Gidiş Dönüş(2)\nSeçiminiz: ");
        tripType = input.nextInt();
        finPrice = perKm * km;

        switch (tripType) {
            case 1:
                if (age <= 12) {
                    finPrice = finPrice * 0.5;
                    System.out.print("Sayın " + nameSurname + "\n12 yaşından küçük olduğunuz için %50 indirim yapılmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice + " Türk Lirası ödemeniz gerekmektedir.");
                } else if (age > 12 && age <= 24) {
                    finPrice = finPrice - (finPrice * 0.1);
                    System.out.print("Sayın " + nameSurname + "\n12-24 yaş aralığında olduğunuz için %10 indirim yapılmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice + " Türk Lirası ödemeniz gerekmektedir.");
                } else if (age >= 65) {
                    finPrice = finPrice - (finPrice * 0.3);
                    System.out.print("Sayın " + nameSurname + "\n65 yaşından büyük olduğunuz için %30 indirim yapılmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice + " Türk Lirası ödemeniz gerekmektedir.");
                } else {
                    System.out.print("Sayın " + nameSurname + "\nHerhangi bir indirimden faydalanamıyorsunuz. Malasef...");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice + " Türk Lirası ödemeniz gerekmektedir.");
                }
            case 2:
                if (age <= 12) {
                    finPrice = finPrice * 0.5; finPrice = finPrice-(finPrice*0.2);
                    System.out.print("Sayın " + nameSurname + "\n12 yaşından küçük olduğunuz için %50 indirim yapılmıştır.");
                    System.out.println("Gidiş-Dönüş seçtiğiniz için ekstra % 20 indirim daha uygulanmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice * 2 + " Türk Lirası ödemeniz gerekmektedir.");
                } else if (age > 12 && age <= 24) {
                    finPrice = finPrice - (finPrice * 0.1); finPrice = finPrice-(finPrice*0.2);
                    System.out.print("Sayın " + nameSurname + "\n12-24 yaş aralığında olduğunuz için %10 indirim yapılmıştır.");
                    System.out.println("Gidiş-Dönüş seçtiğiniz için ekstra % 20 indirim daha uygulanmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice * 2 + " Türk Lirası ödemeniz gerekmektedir.");
                } else if (age >= 65) {
                    finPrice = finPrice - (finPrice * 0.3); finPrice = finPrice-(finPrice*0.2);
                    System.out.print("Sayın " + nameSurname + "\n65 yaşından büyük olduğunuz için %30 indirim yapılmıştır.");
                    System.out.println("Gidiş-Dönüş seçtiğiniz için ekstra % 20 indirim daha uygulanmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice * 2 + " Türk Lirası ödemeniz gerekmektedir.");
                } else {
                    finPrice = finPrice - (finPrice * 0.2);
                    System.out.println("Gidiş-Dönüş seçtiğiniz için ekstra % 20 indirim daha uygulanmıştır.");
                    System.out.println("Toplam " + km + " KM yol için " + finPrice * 2 + " Türk Lirası ödemeniz gerekmektedir.");
                }
        }


    }
}
