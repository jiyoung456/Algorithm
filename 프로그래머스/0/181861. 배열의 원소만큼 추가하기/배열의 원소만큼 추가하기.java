import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        //arraylist로 answer 선언
        //arr[i] = j로 두고 j번 집어넣기
        //answer를 int[]로 변환
        ArrayList<Integer> answerList = new ArrayList<Integer>();
        
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i]; j++) {
                answerList.add(arr[i]);
            }
        }
        
        return answerList;
    }
}