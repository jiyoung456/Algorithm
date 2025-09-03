class Solution {
    public String solution(String n_str) {
        //문자열이 0으로 시작하면 첫 문자 제거를 계속 반복
        //0으로 시작하지않을 때까지
        while (n_str.startsWith("0")) {
           n_str = n_str.substring(1);
        }
        return n_str;
    }
}