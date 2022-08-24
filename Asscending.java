package week5.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Asscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   List<Integer> num =new ArrayList<>();
   num.add(1);
   num.add(2);
   num.add(3);
   num.add(4);
   num.add(5);
   num.add(6);
   num.add(7);
   num.add(8);
   num.add(9);
   num.add(10);
   
    Collections.sort(num);
    System.out.println(num);
    Collections.reverse(num);
    System.out.println(num);
   
   
   
   }

}
