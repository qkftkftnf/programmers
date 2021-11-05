// 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

/*문자열 s를 한 단어씩 나누어 arr배열에 넣어준뒤 단어의 길이가 짝수인지 홀수인지 판단하여 글자를 반환하는 방식으로 구현하였다.*/
class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[]=s.split("");
        
        if(s.length()%2==0){
            answer+=arr[(s.length()/2)-1];
            answer+=arr[s.length()/2];
        }else{
            answer+=arr[s.length()/2];
        }
            
        return answer;
    }
}