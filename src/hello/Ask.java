package hello;

import java.util.Scanner;

public class Ask {

	public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        System.out.println("��������Ϊ��λ�����������\r\n"  + 
        		"Please enter your height in centimeters");
        int price;
        		price = in.nextInt();
        System.out.println("����ɵ�λΪ�ߺ�" + (0.03*price));
	}

}