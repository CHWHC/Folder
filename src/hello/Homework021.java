package hello;

import java.util.Scanner;

public class Homework021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);//输入语句
		double eruos,rate;//定义变量类型
		System.out.println("How many eruos are you exchanging?");//输出语句，询问要兑换的欧元
		eruos=in.nextDouble();//输入变量的值
		System.out.println("What is the exchange rate?");//输出语句，询问兑换的汇率
		rate=in.nextDouble();//输入变量的值
		System.out.println(eruos+" euros at an exchange rate of"+rate+"is");
		//输出语句，说明要兑换的欧元和汇率
		System.out.println(String.format("%.2f", eruos*rate*0.01)+"U.S. dollars.");
		//输出两位小数的美元
	}

}
