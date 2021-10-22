// 함수 solution은 정수 n을 매개변수로 입력받습니다.
// n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.
/*처음 while문을 이용하여 n의 자릿수를 알아내고 arr이라는 배열에 n의 각 자릿수 숫자들을 하나씩 순서대로 넣어준뒤 arr배열을 정렬 함수를 통해 오름차순 정렬을 해보았습니다. 그 뒤 answer에 오름차순된 arr의 가장 큰 수부터 하나하나 더해가며 내림차순으로 수를 배치하는방식으로 구현하였습니다*/
import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        long arr[]=new long[10];
        int count=0;

        
        while(n>0){
            arr[count]=n%10;
            n/=10;       
            count++;
        }
        
        Arrays.sort(arr);
        long num=(long)Math.pow(10,count-1);
        
        for(int i=9;i>9-count;i--){
            answer+=(arr[i]*num);
            num/=10;
        }

        
   
        return answer;
    }
}