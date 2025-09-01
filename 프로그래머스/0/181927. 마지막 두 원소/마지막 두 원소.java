class Solution {
    public int[] solution(int[] num_list) {
        int l = num_list.length;
        int[] answer = new int[l + 1];
        
        //answer에 기존 배열 넣기
        for (int i = 0; i < l; i++) {
            answer[i] = num_list[i];
        }
        answer[l] = 0;
        
        //마지막 원소 정하기
        if (num_list[l - 1] > num_list[l - 2]) {
            answer[l] = num_list[l - 1] - num_list[l - 2];
        } else {
            answer[l] = num_list[l - 1] * 2;
        }
        return answer;
    }
}