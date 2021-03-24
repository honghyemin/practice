package day0322;

public class Exam01 {
    
    public static double solution(int[] intArr) {
        int sum = 0;
        int num = 0;
        double average = 0;

        for(int i : intArr) {
            sum += i;
            num ++;
        }
        if(num > 0) {
            average = (double) sum / num;
        }
        return average;
    }

    public static void main(String[] args) {
        //예시
        int[] intArr1 = {5,10,15};
        System.out.println(solution(intArr1));

    }

}


