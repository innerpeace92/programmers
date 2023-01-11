class Solution {
    public int solution(int num, int k) {
        int answer=0;
        String aaa = Integer.toString(num);
        String bbb = Integer.toString(k);
        if(aaa.indexOf(bbb)==-1){
            answer=-1;
        }
        else{
            answer=aaa.indexOf(bbb)+1;
        }
        return answer;
    }
}