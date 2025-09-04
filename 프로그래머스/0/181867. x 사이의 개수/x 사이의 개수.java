import java.util.*;

class Solution {
    public List<Integer> solution(String myString) {
        //가변 배열 필요 > arrayList 선언
        //count를 두고 x를 만나면 count를 answer에 대입
        
        int count = 0;
        
        List<Integer> answer = new ArrayList<>();
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) != 'x') {
                count++;
            } else {
                answer.add(count);
                count = 0;
            }     
        }
        answer.add(count);
        return answer;
    }
}