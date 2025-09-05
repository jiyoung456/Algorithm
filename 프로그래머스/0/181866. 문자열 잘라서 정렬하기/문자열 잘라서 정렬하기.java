import java.util.*;

class Solution {
    public String[] solution(String myString) {
        // 1. 문자열을 'x' 기준으로 자르기
        String[] splitArr = myString.split("x");

        // 2. 빈 문자열 제거
        List<String> filtered = new ArrayList<>();
        for (String s : splitArr) {
            if (!s.isEmpty()) {
                filtered.add(s);
            }
        }

        // 3. 정렬
        Collections.sort(filtered);

        // 4. List → 배열로 변환
        return filtered.toArray(new String[0]);
    }
}
