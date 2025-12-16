import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int[] cases = new int[t];

        for (int i = 0; i < t; i++) {
            cases[i] = Integer.parseInt(br.readLine());

            if (cases[i] <= 25) {
                System.out.println("Case #" + (i+1) + ": " + "World Finals");
            } else if (cases[i] <= 1000) {
                System.out.println("Case #" + (i+1) + ": " + "Round 3");
            } else if (cases[i] <= 4500) {
                System.out.println("Case #" + (i+1) + ": " + "Round 2");
            } else {
                System.out.println("Case #" + (i+1) + ": " + "Round 1");
            }
        }

    }

    }
