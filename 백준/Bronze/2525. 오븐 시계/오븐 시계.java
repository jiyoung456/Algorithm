import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int time = sc.nextInt();

        if ((min + time) < 60) {
            min += time;
        } else {
            hour += ((min + time) / 60 );
            min = ((min + time) % 60 );

        }

        if (hour >= 24) {
            hour = (hour % 24);
        }

        System.out.print(hour + " " + min);
    }
}