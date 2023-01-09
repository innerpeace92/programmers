class Solution {
    public int solution(int hp) {
        int answer = 0;
        int a=hp/5;
        int b= (hp-(5*a))/3;
        int c= (hp-(5*a)-(3*b));
            
            answer= a+b+c;
        return answer;
    }
}