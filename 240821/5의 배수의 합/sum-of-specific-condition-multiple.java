import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;

        if(a >= b) {
            for(int i = a; i <= b; i++) {
            if(i % 5 == 0) {
                sum1 += i;
            }

        }
        }
        else {
            for(int i =b; i <= a; i++) {
                if(i % 5 == 0) {
                sum2 += i;
            }
            }
        }
        System.out.print(sum1+sum2);
    }
}