import java.lang.StringBuilder;

class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder sb = new StringBuilder(my_string);
        //my_string의 s부터 overwrite_string으로 바꾸기
        int owLength = overwrite_string.length();
        sb.replace(s, (s + owLength), overwrite_string);
        return sb.toString();
    }
}
