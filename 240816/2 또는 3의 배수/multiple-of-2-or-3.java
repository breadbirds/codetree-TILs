import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 1; i <= n; i++) {
            if(n % 2 == 0 || n % 3 == 0) {
                System.out.print("1" + " ");

            }
            else {
                System.out.print("0" + " ");
            }
        }
       
    }
}