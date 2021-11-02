//문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
//s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
/*주어진 문자열 s의 값들을 배열에 하나하나 다 저장을 하여주고 정렬함수를 이용하여 정렬을 한 뒤 역순으로 answer에 값을 입력하는 방식으로 코드를 구현*/

import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String arr[]=new String[s.length()];
        for(int i=0;i<s.length();i++){
           arr[i]=Character.toString(s.charAt(i));
        }
        Arrays.sort(arr);
        for(int i=s.length()-1;i>=0;i--){
            answer+=arr[i];
        }
        return answer;
    }
}