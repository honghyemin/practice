package bit0316;
// 입력받은 정수가 양수인지 음수인지, 짝수인지 홀수인지 판별

import java.util.Scanner;

public class Exam06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("숫자를 입력하세요 : ");
        int num = scan.nextInt();
        
        switch(num) {
        
        case 1 : 
        }
        
        

        
        if (num > 0) {
            System.out.println("양수입니다.");
            if(num%2 == 0) {
                System.out.println("짝수입니다.");
            } else {
                System.out.println("홀수입니다.");
            }
            
        } else if (num < 0) {
            System.out.println("음수입니다.");
        } 
    }

}
