import java.io.*;
/*문제 > 입력변수>본문>출력>입출력예제
 * 목표: 첫번째 수가 크면 Yes, 아니면 No
 * 입력 변수: 두 양의 정수
 * 문제 요약: 두 정수 받아서 yes, no 출력 // 00이면 입력 종료
 * 프로그램 구성:
 * 1. input 0이면 종료
 * 2. 아니면 두 수 비교해서 출력
 */
class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true) {
            String[] input = br.readLine().split(" ");
            int a = Integer.parseInt(input[0]);
            int b = Integer.parseInt(input[1]);

            if (a == 0 && b == 0) {
                break;
            } else {
                String result = (a > b) ? "Yes" : "No";
                bw.write(result + "\n");
            }
        }
        bw.flush();
        }
    }