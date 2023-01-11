class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] arr = (("")+order).split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].contains("3")||arr[i].contains("6")||arr[i].contains("9"))
                answer++;
            }
        return answer;
    }
}