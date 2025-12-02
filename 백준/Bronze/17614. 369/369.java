import java.awt.font.FontRenderContext;
import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            String numberString = Integer.toString(i);
            for (int j = 0; j < numberString.length(); j++) {
                int temp = numberString.charAt(j);
                if (temp == 51) {
                    answer++;
                }
                if (temp == 54) {
                    answer++;
                }
                if (temp == 57) {
                    answer++;
                }
            }
        }

        System.out.println(answer);
    }
}