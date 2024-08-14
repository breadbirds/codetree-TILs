import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g = sc.nextInt();
        int a = sc.nextInt();

        if(g == 0) {
            if(a >= 19) {
                System.out.print("MAN");
            }
            else {
                System.out.print("BOY");
            }

        if(g == 1) {
            if(a >= 19) {
                System.out.print("WOMAN");
            }
            else{
                System.out.print("GIRL");
            }
        }
            
        


    }
}
}