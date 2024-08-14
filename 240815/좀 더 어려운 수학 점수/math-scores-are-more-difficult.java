import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int aMath, aEnglish, bMath, bEnglish;
     aMath = sc.nextInt();
     aEnglish = sc.nextInt();   
     bMath = sc.nextInt();
     bEnglish = sc.nextInt();

     if(aMath > bMath){
        System.out.print("A");
     }
     if(aMath < bMath) {
        System.out.print("B");
     }
     if(aMath == bMath && aEnglish > bEnglish){
        System.out.print("A");
     }
     if(aMath == bMath && aEnglish < bEnglish){
        System.out.print("B");
     }
    }
}