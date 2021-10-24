//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
// 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

/*주어진 숫자가 0이 될때 까지 10씩 나눠주면서 일의자리 숫자를 떼서 answer에 더하는 방식으로 코드를 구현하였습니다.*/
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n>0){
            answer+=(n%10);
            n/=10;
        }


        return answer;
    }
}