package day0323;

import java.util.ArrayList; 
import java.util.Collections;
import java.util.Scanner;


public class Exam01 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList list = new ArrayList<>();
        System.out.print("단어의 갯수 : ");
        int num = sc.nextInt();
        
        
        if(list.size()<=1 && list.size()>=20000 ) {
            System.out.println("다시 입력해주세요");
            return;
        }
        
        for(int i=0; i<num; i++) {
            System.out.print("단어를 입력해주세요 : ");
            String alpha = sc.next();
            list.add(alpha);
        }
        
        System.out.println(list.toString());
        System.out.println("--------------------------------------");
        Collections.sort(list);
        System.out.println("오름차순 정렬 후 : " + list);
        
        ArrayList<String> list2 = new ArrayList<String>();
        
        for(int i=0; i <list.size(); i++) {
        	if(!list2.contains(list.get(i))) {
        		list2.add((String) list.get(i));
        	}
        	
        } System.out.println(list2);
        
       
       
            
        } 
        

   

}