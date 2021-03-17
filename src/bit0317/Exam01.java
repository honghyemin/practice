package bit0317;

import java.util.Arrays;

//1 ~ 100 사이의 랜덤한 숫자를 5개 발생시키고 오름차순으로 출력하시오
//조건 : 정렬은 어떤정렬도 상관없음 / 랜덤은 객체생성이나 Math함수 이용가능

import java.util.Random;

public class Exam01 {

    static int[] num = new int[5];

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
          
            num[i] = (int) (Math.random() * 100 + 1);
            
        }
        
        Arrays.sort(num);
        for(int i : num) {
            System.out.println(i);
        }
    }

}
