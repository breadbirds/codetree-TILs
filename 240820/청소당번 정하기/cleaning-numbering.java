import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt12 = 0;

        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0 && i % 12 != 0 && i % 6 != 0) {
                cnt2 ++;
               
            }
            if(i % 3 == 0 && i % 12 != 0) {
                cnt3 ++;
            }
            if(i % 12 == 0) {
                cnt12 ++;
            }
        }

        System.out.print(cnt2 + " ");
        System.out.print(cnt3 + " ");
        System.out.print(cnt12 + " ");
        
    }
}