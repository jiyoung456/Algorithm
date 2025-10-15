import java.io.*;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");

        String aStr = nums[0];
        String bStr = nums[1];

        BigInteger aInt = new BigInteger(aStr);
        BigInteger bInt = new BigInteger(bStr);

        System.out.println(aInt.add(bInt));
    }
}