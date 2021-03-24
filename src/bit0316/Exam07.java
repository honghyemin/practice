package bit0316;
// 정수 a,b를 입력 받아 큰 수에서 작은 수를 나눈 몫과 나머지 / 작은 수에서 큰 수를 나눈 몫과 나머지를 출력하세요.

import java.util.Scanner;
public class Exam07 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("숫자 a : ");
        int a = scan.nextInt();
        System.out.print("숫자 b : ");
        int b = scan.nextInt();
        
        //삼항연산자
        if(a>b) {
            System.out.println("몫 : " + a/b);
            System.out.println("나머지 : " + a%b);
            System.out.println("몫 : " + b/a);
            System.out.println("나머지 : " + b%a);
            
        } else if(a<b) {
            System.out.println("몫 : " + a/b);
            System.out.println("나머지 : " + a%b);
            System.out.println("몫 : " + b/a);
            System.out.println("나머지 : " + b%a);
            
        }

    }

}
