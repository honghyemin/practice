package bit0316;

//정수5개를 입력 받아 다음 내용을 출력하세요
//출력내용 : 전체 정수의 합, 양의 정수의 합, 음의 정수의 합.

import java.util.Scanner;
public class Exam08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num=0;
        int sum=0;
        int sum1=0;
        int sum2=0;
        
        for(int i = 1; i<=5; i++) {
            System.out.print("num"+i +"값 :" );
            num = scan.nextInt();
            sum += num;
            if(num>0) {
                sum1 += num;
            } else {
                sum2 += num;
            }
        }
        
        System.out.println("전체 정수의 합 : " + sum);
        System.out.println("양의 정수의 합 : " + sum1);
        System.out.println("음의 정수의 합 : " + sum2);
        
        
        

    }

}
