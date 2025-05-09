import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //10813번 문제
        //3 1 4 2 5
        //n개 입력 받아서 배열에 세팅, m번 반복문 돌릴거
        //들어오면 tmp 선언하고 위치 바꾸기
        //마지막에 배열 출력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] nums = new int[n];

        //배열에 숫자 집어넣기
        for (int i = 0; i < n; i++) {
            nums[i] = (i + 1);
        }

        //숫자 바꾸기
        for (int i = 0; i < m; i++) {
            int change1 = sc.nextInt(); //nums[change1 - 1]
            int change2 = sc.nextInt(); //nums[change2 - 1]

            int tmp = nums[change1 - 1];
            nums[change1 - 1] = nums[change2 - 1];
            nums[change2 - 1] = tmp;
        }

        //배열 출력
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}