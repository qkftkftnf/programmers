//이 문제에는 표준 입력으로 두 개의 정수 n과 m이 주어집니다.
//별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

/* a,b 두 숫자를 입력 받아 a만큼 한줄로 별을 찍고 한칸을 내리는 작업을 b번 반복하는 식으로 코드를 작성*/ 
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++){
                System.out.print("*");        
            }
            System.out.println();
        }
        
    }
}