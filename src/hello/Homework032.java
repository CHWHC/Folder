package hello;

import java.util.Scanner;

public class Homework032 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a=0,b=0,c=0,max=0;
		System.out.println("Enter the first number:");
		a=in.nextInt();
		System.out.println("Enter the second number:");
		b=in.nextInt();
		System.out.println("Enter the third number:");
		c=in.nextInt();
		if (a>b){
			if(a>c){
				max=a;	
			}
		}
		else {
			if (b>c){
				max=b;
			}
			else{
				max=c;
			}

		}
		System.out.println("The largest number is "+max);
}
}