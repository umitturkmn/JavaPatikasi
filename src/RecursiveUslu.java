import java.util.Scanner;

public class RecursiveUslu {

    static int uslu(int x,int y){
        if (y == 0)
            return 1;
        else
            return x * uslu(x,y-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base,out;
        System.out.println("Üslü Sayı Hesaplama");
        System.out.print("Taban girin:");
        base = input.nextInt();
        System.out.print("Üs girin: ");
        out = input.nextInt();
        System.out.println("Sonuç: " + uslu(base,out));
    }
}
