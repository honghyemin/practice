package bit0318;

import java.util.Arrays;

//1번문제 => 배열의 개수를 입력받고 배열값을 입력받고 배열을 거꾸로 출력하세요
//
//입력 예시         출력예시
//5
//1 3 5 6 8         8 6 5 3 1

import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = null;
        int i;

        System.out.print("배열의 갯수 입력 : ");
        int num = sc.nextInt();
        arr = new int[num];

        for (i = 0; i < arr.length; i++) {
            System.out.print("배열 값 입력 : ");
            arr[i] = sc.nextInt();

            
            
        }

        for (i = arr.length-1; i>=0; i--) {
                 System.out.print(arr[i] + " ");
        }
        
      
        

    }

}
