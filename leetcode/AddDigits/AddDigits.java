/*

Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

For example:

Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

Follow up:
Could you do it without any loop/recursion in O(1) runtime?

*/

import java.util.*;

class AddDigits {

   public static void main(String[] args){

      for(String i : args){
	 int sum = solution(Integer.valueOf(i));
	 int tester = testCase(Integer.valueOf(i));
	 if(sum != tester){
	    System.err.format("Sum = %d != testCase = %d\n", sum, tester);
	 }
      }
   }

   private static int testCase(int num){
    
      while (num >= 10){
	 int sum = 0;
	 while (num > 0){
	    sum += num % 10;
	    num /= 10;
	 }
	 num = sum;
      }
      return num;
   }

   private static int solution(int num){
      
      return 1 + ((num-1) % 9);	    //See Digital Root Problem Wikipedia
   }
}
