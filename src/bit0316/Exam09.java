package bit0316;
//1-1에버랜드 놀러가기
//사용자 1명의 나이를 입력하고 주간/야간을 선택하여 에버랜드 이용금액을 출력해주세요.
//조건 1) : 주간 : 나이별 티켓 값의 20%추가금액 발생
//    야간 : 나이별 티켓 값의 15% 할인
//
//조건 2 ) 3세~12세 : 12000원
//    12세 ~ 65세 : 20000원

import java.util.Scanner;

public class Exam09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int price = 0;
        
        System.out.print("나이를 입력해주세요 : ");
        int age = scan.nextInt();
        
        System.out.print("시간(주간=1/야간=2) : ");
        int time = scan.nextInt();
        while(time>2 || time<0) {
            System.out.println("잘못입력했습니다. 다시입력해주세요.");
            System.out.print("시간(주간=1/야간=2) : ");
            time = scan.nextInt();
        }
        
        switch(time) {
        
        case 1 :
            if(age>=3 && age<=12) {
                price = (int) (12000 + 12000*0.2);
                System.out.println("이용금액은 " + price + "원 입니다.");
                
            } else if(age>=12 && age<=65) {
                price = (int) (20000 + 20000*0.2);
                System.out.println("이용금액은 " + price + "원 입니다.");
            }
            break;
        case 2 :
            if(age>=3 && age<=12) {
                price = (int) (12000 - 12000*0.15);
                System.out.println("이용금액은 " + price + "원 입니다.");
                
            } else if(age>=12 && age<=65) {
                price = (int) (20000 - 20000*0.15);
                System.out.println("이용금액은 " + price + "원 입니다.");
            }
            break;
            
        }
        

    }

}
