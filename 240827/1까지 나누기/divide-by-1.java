import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = n;
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            ans = ans / i;
            cnt++;
            
            if(ans <= 1) {
                
                break;
            }
            
        }
           System.out.println(cnt);
      

        
    }
}