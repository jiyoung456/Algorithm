import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //test case n 받기
        //n 개수만큼 num1, num2 배열에 숫자 저장
        //배열에 저장된 숫자 더해서 출력하기

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
           b[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Case #" + (i + 1) + ": " + (a[i] + b[i]));
        }
    }
}


