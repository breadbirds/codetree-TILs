import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a = 1;
        int x = 0;

        while (a != n) {
            a *= 2;
            x++;
        }
        System.out.print(x);
        
    }
}