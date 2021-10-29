// 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
// 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
/*길이 n의 절반만큼 수박을 반복한뒤 만약 n이 홀수일 경우 '수'라는 단어를 더 추가하도록 코드를 구현하였다.*/

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i=0;i<n/2;i++){
            answer+="수박";
        }
        if(n%2!=0){
            answer+="수";
        }
        return answer;
    }
}