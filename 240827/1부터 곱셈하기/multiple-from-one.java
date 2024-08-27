import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int prod = 1;
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            prod *= i;
            if(prod >= n){
                System.out.print(i);
                break;
            }
        }
    }
}