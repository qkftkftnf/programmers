// 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 
// 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

/*주어진 자연수 n의 자릿수를 구하여 answer배열에 끝에서부터 한자리씩 저장하는 방식으로 코드를 구현하였다.*/
class Solution {
    public int[] solution(long n) {
       int x = (int) Math.log10(n);
       int[] answer = new int[x+1];
        
        for(int i=0;i<x+1;i++){
            answer[i]=(int)(n%10);
            n/=10;
        }
        
      return answer;
  }
}