package hello;

import java.util.Scanner;

public class Homework021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);//�������
		double eruos,rate;//�����������
		System.out.println("How many eruos are you exchanging?");//�����䣬ѯ��Ҫ�һ���ŷԪ
		eruos=in.nextDouble();//���������ֵ
		System.out.println("What is the exchange rate?");//�����䣬ѯ�ʶһ��Ļ���
		rate=in.nextDouble();//���������ֵ
		System.out.println(eruos+" euros at an exchange rate of"+rate+"is");
		//�����䣬˵��Ҫ�һ���ŷԪ�ͻ���
		System.out.println(String.format("%.2f", eruos*rate*0.01)+"U.S. dollars.");
		//�����λС������Ԫ
	}

}
