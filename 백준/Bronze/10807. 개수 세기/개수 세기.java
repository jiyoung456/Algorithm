import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int num = sc.nextInt();

        int[] numArray = new int[num];
        for (int i = 0; i < num; i++) {
            numArray[i] = sc.nextInt();
        }

        int targetNum = sc.nextInt();
        for (int i = 0; i < num; i++) {
            if (numArray[i] == targetNum) {
                count++;
            }
        }
        System.out.println(count);
    }
}