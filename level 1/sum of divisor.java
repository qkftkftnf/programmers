// 정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
/*for문을 이용하여 n보다 작거나 같은 숫자들을 n에 나누어 나머지값이 0이 되는 숫자들을 전부 answer에 더하는 방식으로 구현하였습니다.*/
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                answer+=i;
            }
        }
        return answer;
    }
}