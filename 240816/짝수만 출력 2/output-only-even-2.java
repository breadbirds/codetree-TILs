import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        int c = b;

        while(c >= a) {
            System.out.print(c + " ");
            c -= 2;
        }
    }
}