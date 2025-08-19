class Solution {
    public int solution(String my_string, String is_prefix) {
        //접두사 하나씩 끊어내면서
        //is_prefix랑 일치하는지 확인
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            if (my_string.substring(0, i + 1).equals(is_prefix)) {
                answer = 1;
            }
        }
    
        return answer;
    }
}