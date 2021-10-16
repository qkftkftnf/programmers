//행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
//2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.

/*제시되는 두개의 행렬의 각각의 행의길이와 열이길이가 서로 같다는 조건이 있기 때문에 answer행렬을 arr1행렬과 같은 길이의 행렬로 선언을 해준뒤 각각의 자리에 있는 값을 더하여 answer행렬에 똑같은 위치에 배치하는 방식으로 풀어보았습니다.*/
class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}