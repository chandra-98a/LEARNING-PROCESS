package in.stringhandling;

import java.util.Scanner;

public class LuckyPeter2 {
static int temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    System.out.println("Enter the string");
	    Scanner scan = new Scanner(System.in);
			String str=scan.next();
			 str=str.toLowerCase();
			 int i=0;
			
			if((str.charAt(i)==str.charAt(i+1))&& (str.charAt(i+2)==str.charAt(i+3))&&(str.charAt(i+4)==str.charAt(i+5)))
				  {
				temp=1;
			  }else
			  {
				  temp=0;
			  }
		
		if (temp==1) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
			
		   }
}
		 
	


