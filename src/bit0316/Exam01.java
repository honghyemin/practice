package bit0316;

import java.util.Scanner;

public class Exam01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("a의 값 : " );
        int a = scan.nextInt();
        System.out.print("b의 값 : ");
        int b = scan.nextInt();
        
        while(a>b) {
            System.out.println("작은수 먼저 입력해주세요");
            System.out.print("a의 값 : " );
            a = scan.nextInt();
            System.out.print("b의 값 : ");
            b = scan.nextInt();
        }
        
        for(int i = a; i<=b; i++) {
                    
            sum += i;
        }
        System.out.println("a부터 b까지의 합 : " + sum);
        

    }

}
