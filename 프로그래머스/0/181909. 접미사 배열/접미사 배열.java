import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        int index = 0;
        //접미사 찾기
        //사전 순 배열
        for (int i = 0; i < answer.length; i++) {
            answer[i] = my_string.substring(i,answer.length);
        }
         Arrays.sort(answer);
        return answer;
    }
}