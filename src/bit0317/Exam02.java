package bit0317;

import java.util.Scanner;
public class Exam02 {
    
    static final int APPLE = 500;
    static final int BANANA = 800;
    static final int ORENGE = 1000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int money = 0;
        
        
        while(true) {
            
            System.out.println("어떤 과일을 좋아하세요?");
            System.out.println("1. 사과 2. 바나나 3. 오렌지");
            System.out.print("원하는 과일 번호를 입력하세요 : ");
            int fNum = sc.nextInt();
            
            switch(fNum) {
            
            case 1 : 
                System.out.print("구입할 과일의 개수를 입력하세요 :");
                num = sc.nextInt();
                money += APPLE*num;
                break;
                
            case 2 : 
                System.out.print("구입할 과일의 개수를 입력하세요 :");
                num = sc.nextInt();
                money += BANANA*num;
                break;
                
            case 3 :
                System.out.print("구입할 과일의 개수를 입력하세요 :");
                num = sc.nextInt();
                money += ORENGE*num;
                break;
                
            }
            System.out.print("추가로 다른 과일의 구입을 원하시면 1번 | 아니면 2번을 입력하세요 : ");
            int choice = sc.nextInt();
            if(choice==1) {
               continue;
            }else {
                System.out.printf("당신이 지불할 가격은 %d 원 입니다.",money);
               break;
            }      

            
        }
        
        

    }

}
