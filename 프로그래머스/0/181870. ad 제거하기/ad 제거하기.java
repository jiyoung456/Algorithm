import java.util.*;

class Solution {
    public  ArrayList<String> solution(String[] strArr) {
        //arraylist로 변환
        ArrayList<String> answer = new ArrayList<>();
        
        //ad있는지 확인 > 있으면 해당 원소 삭제
        for (int i = 0; i < strArr.length; i++) {
            if (!strArr[i].contains("ad")) {
                answer.add(strArr[i]);
            }
        }
        
        return answer;
    }
}