import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] words = br.readLine().split("");
        int answer = 0;

        for (int i = 0; i < words.length; i++) {
            int num = words[i].charAt(0);
            int result = 0;

            if (num <= 'C') {
                result = 3;
            } else if (num <= 'F') {
                result = 4;
            } else if (num <= 'I') {
                result = 5;
            } else if (num <= 'L') {
                result = 6;
            } else if (num <= 'O') {
                result = 7;
            } else if (num <= 'S') {
                result = 8;
            } else if (num <= 'V') {
                result = 9;
            } else {
                result = 10;
            }
            answer += result;
        }
        System.out.println(answer);
    }
}