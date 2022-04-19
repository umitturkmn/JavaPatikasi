import java.util.Scanner;

public class Palindromik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String words;
        System.out.print("Kelime giriniz: ");
        words = input.nextLine();
        if (isPalindrome(words)){
            System.out.println("Kelime Palindromdur.");
        }
        else{
            System.out.println("Kelime Normaldir.");
        }

    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
