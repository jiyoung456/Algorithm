import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String nums[] = br.readLine().split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            if (a == 0 && b == 0) {
                break;
            }

            bw.write((a + b) + "\n");

        }

        bw.flush();
        bw.close();
        br.close();
    }
}