public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sayı dizisi:");
        int a = 0;
        int b = 1;
        int c = 0;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i <= 10; i++) {
            c = a + b;

            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
