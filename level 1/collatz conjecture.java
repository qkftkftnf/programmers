// 1937년 Collatz란 사람에 의해 제기된 이 추측은, 주어진 수가 1이 될때까지 다음 작업을 반복하면, 모든 수를 1로 만들 수 있다는 추측입니다. 작업은 다음과 같습니다.

/* 작업을 반복하는 반복문을 만들어 반복횟수가 500보다 같거나 클때 혹은 주어진 정수가 1이 되었을때 반복문을 부스는 조건으로 구성하였다. 반복문 안에서는 주어진 정수를 2로 나눈 나머지값으로 짝수인지 홀수인지 판단하고 그에 맞게 작업을 시행하는 방식으로 구현하였다. */

class Solution {
    public int solution(int num) {
        int answer = 0;
        
        while(num!=1){
            if(answer>=500){
                answer=-1;
                break;
            }else if(num%2==0){
                num/=2;
            }else if(num%2==1){
                num=(num*3)+1;
            } 
            answer++;
        }
        return answer;
    }
}