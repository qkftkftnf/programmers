// 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
// 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
// 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
/* 주어진 정수 x를 a라는 변수에 그대로 복사한 뒤 while문을 이용해 sum이라는 변수에 한자리 한자리 더한뒤 x를 sum으로 나눈 나머지값이 0인지 아닌지를 판단하는 방식으로 구현하였다.*/
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum=0;
        int a=x;
        
        while(a>0){
            sum+=(a%10);
            a/=10;
        }
        if(x%sum==0){
            answer=true;
        }else{
            answer=false;
        }
        
        return answer;
    }
}