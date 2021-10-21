// 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
// 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
// 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
/*최대 공약수가 될 정수와 최소 공배수가 될 정수를 선언 해 주고 값을 올리면서 두 수 중 한 수보다 커지게 될경우 그 전에 나왔던 공약수를 최대 공약수로 설정하여주고 두 수가 나누었을때 나머지가 0이 되는 최소값을 최소 공배수로 설정하였다.*/
class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int min=1;
        int max=1;
        
        while(true){
            if(n%min==0 && m%min==0){
                answer[0]=min;     
            }else if(min>n || min>m)
                break;
            min++;
        }
        while(true){
            if(max%n==0 && max%m==0){
                answer[1]=max;
                break;
            }
            max++;
        }
        
        return answer;
    }
}