// 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
// 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.

/*문자열 phone_number가 주어졌기 때문에 해당 문자열의 길이를 받은뒤 arr배열에 문자열을 한자리한자리 조개서 저장을 하여 문자열에서 마지막 4자리를 제외한 부분은 *로 추가를 하고 나머지 마지막 4자리는 arr배열에서 가져오는 방식으로 구현하엿다.*/
class Solution {
    public String solution(String phone_number) {
        int length=phone_number.length();
        String arr[]=phone_number.split("");
        String answer = "";
        
        for(int i=0;i<length-4;i++){
            answer+="*";
        }
        for(int i=length-4;i<length;i++){
            answer+=arr[i];
        }
        return answer;
    }
}