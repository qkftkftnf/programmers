// 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
// n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.

/*기본 answer값을 -1로 설정을 하였고 주어진 양의 정수 n이 x의 제곱이 아닌지 확인하기 위해 n/x의 값이 x인지 n%x의 값이 0인지 확인을 하고 만약 x의 제곱이라고 나왔다면 answer에 x+1의 제곱값을 대입하는 방식으로 코드를 구현하였다.*/

class Solution {
    public long solution(long n) {
        long answer = -1;
        long count=1;
        
        while(count*count<=n){
            if(n/count==count && n%count==0){
                answer=(long)Math.pow(count+1,2);
                break;
            }
            count++;  
        }
        return answer;
    }
}