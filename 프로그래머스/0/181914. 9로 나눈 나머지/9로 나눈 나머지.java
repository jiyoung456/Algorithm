class Solution {
    public int solution(String number) {
        int answer = 0;
        int sum = 0;
        //문자열 각 자리의 합 구하기
        for (int i = 0; i < number.length(); i++) {
            sum += Character.getNumericValue(number.charAt(i));
        }
        //합을 9로 나누기
        answer = sum % 9;
        return answer;
    }
}