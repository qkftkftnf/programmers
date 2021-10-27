// 어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
// 예를 들어 "AB"는 1만큼 밀면 "BC"가 되고, 3만큼 밀면 "DE"가 됩니다. "z"는 1만큼 밀면 "a"가 됩니다.
// 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

/*주어진 문자열을 char형으로 변환시켜 아스키코드값을 저장을 하고 해당 아스키 코드값에 n값을 더해 만약 범위를 벗어나게 된다면 26을 마이너스하여 다시 범위내로 들어오게 한뒤 string 형으로 변환하여 answer에 저장하도록 코드를 구현하였다.*/
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
           
            int a=s.charAt(i)+n;
            if(s.charAt(i)==32)
                a-=n;
            else if(s.charAt(i)<91 && a>90 )
                a-=26;
            else if(s.charAt(i)<123 && a>122 )
                a-=26;
            answer+=Character.toString((char)a);
            
        }
        
        return answer;
    }
}