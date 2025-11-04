import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input1 = br.readLine().split(" ");
        int n = Integer.parseInt(input1[0]);
        int x = Integer.parseInt(input1[1]);

        String[] input2 = br.readLine().split(" ");

        String result = "";

        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(input2[i]);
            if (temp < x) {
                result += temp + "" + " ";
            }
        }
        bw.write(result);
        bw.flush();

    }
}