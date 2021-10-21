// 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
// 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
// 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
/*주어진 배열의 길이가 1일경우 answer은 1의 길이의 배열 아닐 경우 배열-1길이의 배열로 초기화를 시켜주었다. 먼저 for문을 돌려 가장 작은 값이 있는 위치를 찾아내고 answer배열에 그 값이 아닌 다른값들만 저장하게 하는 식으로 코드를 구현하였다.*/


class Solution {
    public int[] solution(int[] arr) {
        int count=0;
        if(arr.length==1)
            count=1;
        else
            count=arr.length-1;
        int[] answer = new int [count];
        int min=arr[0];
        int num=0;
        if(arr.length==1){
            answer[0]=-1;
        }else{
            for(int i=0;i<arr.length;i++){  
                if(arr[i]<min){
                    min=arr[i];
                    num=i;
                }    
            }
            for(int i=0;i<arr.length-1;i++){ 
                if(i<num){
                    answer[i]=arr[i];
                }else{
                    answer[i]=arr[i+1];
                }    
            }    
        }
            
        return answer;
    }
}