package hello;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 Scanner in = new Scanner(System.in);
	 int a = in.nextInt();
	 int b = in.nextInt();
	 int c = in.nextInt();
	 int max = 0;
	 if (a>b) 
	 {
		 if (a>c)
		 {
			 max = a;
		 }
		 else
		 {
			 max = c;
		 }
	 }
	 else
	 {
		 if (b>c) 
		 {
			 max = b;
		 }
		 else
		 {
			 max = c;
		 }
	 }
	 System.out.println(max);
	}
}