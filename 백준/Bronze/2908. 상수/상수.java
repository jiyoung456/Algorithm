import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");
        String num1 = nums[0];
        String num2 = nums[1];

        StringBuffer sb1 = new StringBuffer(num1);
        sb1.reverse();

        StringBuffer sb2 = new StringBuffer(num2);
        sb2.reverse();

        int num1R = Integer.parseInt(sb1.toString());
        int num2R = Integer.parseInt(sb2.toString());

        int result = Math.max(num1R, num2R);

        bw.write(Integer.toString(result));
        bw.flush();
        
    }
}