class Solution {
    public double solution(int a, int b, int c) {
        double answer = 0;
       //제곱, 세제곱의 합
        double sum = a + b + c;
        double squareSum = Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2);
        double cubeSum = Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3);
        
         //a, b, c가 다 다른 경우
        //a, b, c가 다 같은 경우
        // 나머지 경우
        if(a == b && b == c) {
            answer = sum * squareSum * cubeSum;
        } else if (a != b && b != c && c != a) {
            answer = sum;
        } else {
            answer = sum * squareSum;
        }
        return answer;
    }
}