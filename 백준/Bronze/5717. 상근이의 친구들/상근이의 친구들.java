import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String[] inputs = br.readLine().split(" ");

            int m = Integer.parseInt(inputs[0]);
            int f = Integer.parseInt(inputs[1]);

            if (m == 0 & f ==0) {
                return;
            } else{
                int num = m + f;
                bw.write(num + "" + "\n");
            }
            bw.flush();
        }


    }
}