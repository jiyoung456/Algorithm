import java.io.*;
import java.util.Scanner;

public class Main {
//종료 시점을 null로 생각하고 풀어보기!
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String line = br.readLine();
            if (line == null || line.equals("")) break;
            String nums[] = line.split(" ");
            int a = Integer.parseInt(nums[0]);
            int b = Integer.parseInt(nums[1]);

            bw.write((a + b) + "\n");
            bw.flush();
}
    }
}