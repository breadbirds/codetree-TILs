import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aAge, bAge;
        char aGender, bGender;

        aAge = sc.nextInt();
        aGender = sc.next().charAt(0);
        bAge = sc.nextInt();
        bGender = sc.next().charAt(0);

        if((aAge >= 19 && aGender == 'M') || bAge >= 19 && bGender == 'M') {
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }


    }
}