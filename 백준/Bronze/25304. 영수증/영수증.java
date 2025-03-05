import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //totalPrice, totalNumber 입력 받기
        //totalNumber 개수만큼 price, number 입력받아서 sum에 저장하기
        //totlaPrice와 sum 일치하면 yes, 아니면 no

        int totalPrice = sc.nextInt();
        int totalNumber = sc.nextInt();
        int sum = 0;
        int count = 0;

        while (count < totalNumber) {
            int price = sc.nextInt();
            int number = sc.nextInt();
            sum += price * number;
            count++;
        }

        if (totalPrice == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}