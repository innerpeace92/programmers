import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int k= numbers.length;
        answer= numbers[k-1]*numbers[k-2];
        return answer;
    }
}