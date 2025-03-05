import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //정수n개로 이루어진 배열, 정수x
        //배열에 숫자 받아 넣기

        //x보다 작은 배열 수 찾기
        //배열 출력

        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
//         ArrayList<Integer> printArr = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            }
        for (int i = 0; i < n; i++) {
            if (arr[i] < x) {
                System.out.print(arr[i] + " ");
            }
        }
        }
    }