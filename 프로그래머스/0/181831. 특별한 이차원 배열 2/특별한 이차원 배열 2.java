class Solution {
    public int solution(int[][] arr) {
        int answer = 0;
        int sum = 0;
        int l = arr.length;
        //반복문 2번 돌려서 같은지 확인
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == arr[j][i]) {
                    sum += 1;
                }
            }
        }
        if (sum == l * l) {
            answer = 1;
        }
        return answer;
    }
}