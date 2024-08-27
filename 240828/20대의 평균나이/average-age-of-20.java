import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        while (true) {
            int age = sc.nextInt();

            // 조건을 만족하지 않는 경우에만 평균 계산에 포함
            if (age <= 29 && age >= 20) {
                sum += age;
                cnt++;
            }

            if (age > 29 || age < 20) {
                // 평균을 계산할 때 cnt가 0이면 오류가 나지 않도록 확인
                double avg = (cnt > 0) ? (double) sum / cnt : 0.0;
                System.out.printf("%.2f", avg);
                break;
            }
        }
    }
}