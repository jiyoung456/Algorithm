class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        //a를 b로, b를 a로 바꾸기
        //pat가 있는지 확인
        
        myString = myString.replace("A", "b");
        myString = myString.replace("B", "A");
        myString = myString.replace("b", "B");
        
        answer = myString.contains(pat) ? 1 : 0;
        return answer;
    }
}