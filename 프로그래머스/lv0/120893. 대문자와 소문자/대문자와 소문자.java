import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String word1 = my_string.toUpperCase();
        String word2 = my_string.toLowerCase();
        for(int i=0; i<my_string.length(); i++){
            if(my_string.charAt(i)!=word1.charAt(i)){
                  answer+=word1.charAt(i);
            }
            else if(my_string.charAt(i)!=word2.charAt(i)){
                answer+=word2.charAt(i);
            }
        }
        return answer;
    }
}