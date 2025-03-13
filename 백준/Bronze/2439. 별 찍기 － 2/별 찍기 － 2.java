import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //case n 받기
        //공백 (n - i)개 * i개 출력

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1 ; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}