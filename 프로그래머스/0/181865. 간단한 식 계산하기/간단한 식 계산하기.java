class Solution {
    public int solution(String binomial) {
        int answer = 0;
        //공백 기준으로 나눠서 bList에 담기
        String[] bList = binomial.split(" ");
        //연산기호(bList[1])의 경우에 따라 계산
        if (bList[1].equals("+")) {
            answer = Integer.parseInt(bList[0]) + Integer.parseInt(bList[2]);
        } else if (bList[1].equals("-")) {
            answer = Integer.parseInt(bList[0]) - Integer.parseInt(bList[2]);
        } else if (bList[1].equals("*")) {
            answer = Integer.parseInt(bList[0]) * Integer.parseInt(bList[2]);
        }
        return answer;
    }
}