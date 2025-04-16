import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int numList[] = new int[num];

        numList[0] = sc.nextInt();
        int max = numList[0];
        int min = numList[0];

        for (int i = 1; i < num; i++) {
            numList[i] = sc.nextInt();

            if (numList[i] < min) {
                min = numList[i];
            }

            if (numList[i] > max) {
                max = numList[i];
            }
        }

        System.out.println(min + " " + max);
    }
}
