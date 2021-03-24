package bit0316;

import java.util.Scanner;

public class Exam02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("원하는 단을 입력해주세요 : ");
        int num = scan.nextInt();    
        int sum = 0;
        
        for(int i = num; i<=num; i++) {
            for(int j = 1; j<=9; j++) {
                sum = i*j;
                System.out.printf("%d x %d = %d \n", i,j,sum  );
            }
        }

    }

}
