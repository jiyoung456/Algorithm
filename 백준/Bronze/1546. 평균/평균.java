import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        //점수를 배열로 받기
        //받은 점수중에 최댓값 max 고르기
        //점수 보정하기
        //평균 구하기

        double[] arr = new double[num];
        double[] newArr = new double[num];
        double max = 0;
        double newSum = 0;
        double newAv = 0;


        for (int i = 0; i < arr.length; i++) {
           arr[i] = sc.nextInt();

            if (arr[i] >= max) {
                max = arr[i];
            }
        }

        for (int k = 0; k < arr.length; k++) {
            newArr[k] = arr[k] / max * 100;
            newSum += newArr[k];
        }

        System.out.println(newSum / num);
    }
}