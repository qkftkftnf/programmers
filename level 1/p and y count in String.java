//대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
//s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
//'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
//단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.

/*주어진 문자열 s를 소문자의 형식으로 전부 통일 한뒤 각 자리마다 p 혹은 y인지 확인하면서 맞다면 갯수를 올리는 작업을 거친다 그 다음 만약 p와 y의 갯수가 같다면 처음 그대로 true를 아닐경우 false를 반환하는 방식으로 코드를 구현하였다. */

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String ex = s.toLowerCase();
        int pc=0, yc=0;
        
        for(int i=0;i<s.length();i++){
            if(ex.charAt(i)=='p')
                pc++;
            else if(ex.charAt(i)=='y')
                yc++;
        }
       if(pc!=yc)
           answer=false;

        return answer;
    }
}