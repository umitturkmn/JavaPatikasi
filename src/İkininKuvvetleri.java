import java.util.Scanner;

public class İkininKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,total=0;

        System.out.println("Girdiğiniz sayıya kadar olan 2'nin kuvvetlerinin toplamını bulacağız.");

        System.out.print("Sayı giriniz: ");
        a = input.nextInt();
        System.out.println("Gİrdiğiniz sayıdaki 2'nin kuvvetleri: ");
        for (int i = 1; i < a; i*=2){
            System.out.print(i+"-");
            total+=i;
        }
        System.out.println("Toplamı: " + total);





    }
}
