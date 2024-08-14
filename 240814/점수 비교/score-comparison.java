import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Math_a = sc.nextInt();
        int English_a = sc.nextInt();
        int Math_b = sc.nextInt();
        int English_b = sc.nextInt();

        if(Math_a > Math_b && English_a > English_b){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
    }
}