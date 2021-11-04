// array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
// divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

/*arr 배열은 서로 중복 되는 숫자가 없다. 만약 divisor로 나누엇을때 나누어 떨어지는 값이 없을 경우를 대비하여 count를 1부터 시작하고 나누어 떨어지는 값이 있다면 count를 1 빼서 알맞게 배열을 선언해 준다 그 뒤 만약 나누어 떨어지는 값이 없는 배열이였다면 -1의 값을 넣도록 코드를 구현하였다.*/
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {  
        int count=1;
        int a=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                count++;
                a++;
            }
        }
        if(count>1)
            count--;
            
        
        int answer[]=new int[count];
        
        if(a==0)
            answer[0]=-1;
        else{
            for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                answer[--count]=arr[i];
            }
        }
    }
            Arrays.sort(answer);
        
        return answer;
    }
}