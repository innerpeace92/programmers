class Solution {
    public int solution(int n) {
        int answer = 0;
        String aaa=Integer.toString(n);
        for(int i=0; i<aaa.length(); i++){
             answer+=Integer.parseInt(aaa.substring(i,i+1));
        }
       
        return answer;
    }
}