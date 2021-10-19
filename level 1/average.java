//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
/*arr배열로 준 정수값을 answer에 모두 더한뒤 arr의 길이만큼 나누는 방식으로 코드를 구현하였다.*/
class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(int i=0;i<arr.length;i++){
            answer+=arr[i];
        }
        answer/=arr.length;
        return answer;
    }
}