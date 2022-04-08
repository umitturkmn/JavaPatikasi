import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user, pass;
        System.out.println("****************************");
        System.out.println("*****-KULLANICI GİRİŞİ-*****");
        System.out.println("****************************");
        System.out.print("Kullanıcı Adınız: ");
        user = input.nextLine();
        System.out.print("Şifriniz:");
        pass = input.nextLine();

        if (user.equals("umitbaba") && pass.equals("adamsin123")) {
            System.out.println("Başarıyla Giriş Yapıldı.");
        } else {
            System.out.print("Bilgileriniz yanlıştır.\nŞifrenizi Sıfırlamak ister misiniz?(E/H): ");
            String select = input.nextLine();
            switch (select){
                case "E","e":
                    System.out.print("Yeni şifrenizi giriniz: ");
                    pass = input.nextLine();
                    if (pass.equals("adamsin123")){
                        System.out.println("Eski şifrenizi girdiniz. İşlem iptal edildi.");
                    } else {
                        System.out.println("Şifreniz Değiştirilmiştir.");
                    }
            }
        }
    }
}
