import java.util.Scanner;

public class UmitBank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String idNumber, pass;
        int control = 3, select, balance = 5252;
        System.out.println("*************************");
        System.out.println("******-ÜMİT BANK-********");
        System.out.println("******-HOŞGELDİNİZ-******");
        while (control > 0) {
            System.out.print("Lütfen T.C.K No giriniz: ");
            idNumber = input.nextLine();
            System.out.print("Lütfen Şifrenizi girininiz: ");
            pass = input.nextLine();
            if (idNumber.equals("11122233344") && pass.equals("482482")) {
                System.out.println("Başarıyla giriş yaptınız.\nYapmak istediğiniz işlemi seçiniz.");
                while (control>0){
                    System.out.print("1-Para yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap\nSeçiminiz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                            balance += input.nextInt();
                            System.out.println("İşleminiz tamamlanmıştır. Menüye yönlendiriliyorsunuz.");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            balance -= input.nextInt();
                            System.out.println("İşleminiz tamamlanmıştır. Menüye yönlendiriliyorsunuz.");
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " Türk Lirasıdır.");
                            System.out.println("İşleminiz tamamlanmıştır. Menüye yönlendiriliyorsunuz.");
                            break;
                        case 4:
                            System.out.println("Hoşçakalın.");
                            control = 0;
                            break;
                        default:
                            control--;
                            System.out.println("Hatalı tuşladınız." + control + " Hakkınız kaldı.");
                            continue;
                    }
                }

            } else {
                control--;
                System.out.println("T.C.K numaranız veya şifreniz hatalı. Tekrar deneyin.");
                if (control != 0){
                    System.out.println("Kalan hakkınız: " + control);
                } else{
                    System.out.println("Hesabınız bloke olmuştur.");
                }

            }
        }


    }
}
