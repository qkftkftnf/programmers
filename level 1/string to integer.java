// 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.
/*문자열 s의 각 자릿수를 아스키 코드 값으로 변환하여 정수형으로 변환할 수 있게 한다. 각 자릿수에 맞게 10의 제곱수들을 곱해주고 부호가 나왔을 경우에만 음수 양수인지 판단하는 방식으로 코드를 구현하였다.*/
class Solution {
    public int solution(String s) {
        int answer = 0;
        int ten=1;
        for(int i=(s.length()-1);i>=0;i--){
            if(s.charAt(i)==45)
                answer*=-1;
            else if(s.charAt(i)==43)
                answer*=1;
            else{
                answer+=((s.charAt(i)-48)*ten);
                ten*=10;
            }
        }
        return answer;
    }
}