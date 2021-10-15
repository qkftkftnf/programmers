// 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
// 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

/*answer 배열 안에 1부터 n까지의 값과 x값을 곱한 값을 차례대로 저장한다.
하지만 이 값이 int로 표현할 수 있는 최고 범위를 넘는 숫자가 나올 수 있기 때문에 long형태로 변환해서 저장하였다.*/
class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0;i<n;i++){
            answer[i]=(long)(i+1)*x;
        }
        return answer;
    }
}