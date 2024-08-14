import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        if(s == "S"){
            System.out.print("superior");
        }
        else if(s == "A"){
            System.out.print("Excellent");
        }
        else if(s == "B"){
            System.out.print("Good");
        }
        else if(s == "C"){
            System.out.print("Usually");
        }
        else if(s == "D"){
            System.out.print("Effort");
        }
        else{
            System.out.print("Failure");
        }
    }
}