import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //n, m 입력 받고 바구니 배열 선언
        //m번 공 집어넣기
        //i부터 j까지 k 번호 공 넣기

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] nums = new int[n];

        for (int l = 0; l < m; l++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();

            for (int o = (i - 1); o <= (j - 1); o++) {
                nums[o] = k;
            }
        }

        for (int l = 0; l < n; l++) {
            System.out.print(nums[l] + " ");
        }
    }
}