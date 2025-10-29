import java.io.*;
import java.math.BigInteger;
/*문제 > 입력변수>본문>출력>입출력예제
 * 목표: 점수 구하기
 * 입력 변수: test case, 문자열
 * 문제 요약: 맞으면 1점, 연속해서 맞으면 연속 점수
 * 프로그램 구성:
 * test case 받기
 * 점수 출력:
 * case1: o인 경우
 * case2: x인 경우
 * testcase만큼 반복
 *
 */
//    String[] currentTime = br.readLine().split(":"
class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        int caseNum = 0;

        while (caseNum < t) {
            int temp = 0;
            int score = 0;

            String[] ox = br.readLine().split("");

            for (int i = 0; i < ox.length; i++) {
                if (ox[i].equals("O")) {
                    temp++;
                    score += temp;
                } else {
                    temp = 0;
                }
            }
            bw.write(score + "\n");
            caseNum++;
        }
        bw.flush();
    }

}