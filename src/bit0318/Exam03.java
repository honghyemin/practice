package bit0318;
//3번문제 => 배열의 크기를 입력받고 배열에 정수를 입력받아 배열 arr의 평균값을 출력하세요(출력 정수로)
//
//입력 예시         출력예시
//5  10  15                   10

import java.util.Scanner;

public class Exam03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = null;
        int sum = 0;
        
        
        System.out.print("배열의 크기 입력 : ");
        int num = sc.nextInt();
        arr = new int[num];
        
        for(int i =0; i<arr.length; i++){
            System.out.print("숫자 입력 : ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int avg = sum/arr.length;
        System.out.println("합계값 : " + sum);
        System.out.println("평균값 : " + avg);
        
        

    }

}
