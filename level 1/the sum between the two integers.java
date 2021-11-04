// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
// 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.

/*a와 b를 서로 비교한뒤 a가 더 클 경우 두 숫자를 바꿔준다. 그 뒤 a부터 b까지 모든 수를 하나하나 다 더하는 방식으로 코드를 구현하였다.*/

class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        int temp=0;
        if(b<a){
            temp=a;
            a=b;
            b=temp;
        }
        for(int i=a;i<=b;i++){
            answer+=i;
        }
        return answer;
    }
}