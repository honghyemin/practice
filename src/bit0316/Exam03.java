package bit0316;

import java.util.Scanner;
public class Exam03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        System.out.print("숫자를 입력하세요 : " );
        int Num = scan.nextInt();
        
        for(int i = 1; i<Num; i++) {
            sum += i;
        }
        System.out.println("1부터 num까지의 합 : " + sum);

    }

}
