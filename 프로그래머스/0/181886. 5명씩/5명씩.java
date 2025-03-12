import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> solution(String[] names) {
        List<String> answer = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            if ((i % 5) == 0) {
                answer.add(names[i]);
            }
        }
        return answer;
    }
}