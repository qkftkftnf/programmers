// 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.
// 소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
// (1은 소수가 아닙니다.)

/*for문을 이용하여 1부터 n사이의 숫자들을 하나하나 전부 계산해볼때 해당 숫자의 제곱근의 정수형을 구해서 1부터 제곱근의 정수형까지의 숫자로 나누었을때 소수인지 아닌지를 판단하여 answer값을 구하는 방식으로 코드를 구현하였습니다.*/

class Solution {
    public int solution(int n) {
        int answer = 0;
      
        for(int i=1;i<=n;i++){
            int s=(int)Math.sqrt(i);
           for(int j=1;j<=s;j++){     
               if(j!=1 && i%j==0 || i==1){
                   break;
               }
               else if(s==j){
                   answer++;
               }
           }
        }
        return answer;
    }
}