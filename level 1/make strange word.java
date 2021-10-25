// 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
// 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
/*새로운 문자열 배열을 만들어 주어진 문자열을 나누어서 저장을 한뒤 주어진 문자열의 길이만큼 while문을 반복하여 " "가 나오면 새로운 단어가 시작되어 짝수번째에는 대문자 변환을 홀수번째에는 소문자 변환을 하도록 코드를 구현하였습니다.*/

class Solution {
    public String solution(String s) {
        String arr[]=s.split("");;
        String answer = "";
        int i=0;
        int count=1;
        
        while(i<s.length()){
            if(arr[i].equals(" ")){
                count=0;
                answer+=arr[i];
            }
            else{
               if(count%2==0){
                  answer+=arr[i].toLowerCase();
               }else{
                  answer+=arr[i].toUpperCase();
               }   
            }
            count++;
            i++;
        }
        
        return answer;
    }
}