package hello;

import java.util.Scanner;

public class Ask {

	public static void main(String[] args) {
        System.out.println("Hello");
        Scanner in = new Scanner(System.in);
        System.out.println("请以厘米为单位输入您的身高\r\n"  + 
        		"Please enter your height in centimeters");
        int price;
        		price = in.nextInt();
        System.out.println("换算成单位为尺后" + (0.03*price));
	}

}