package String;

import java.util.Scanner;

public class B2908 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt(); //�Է¹��� �� A
		int B = input.nextInt(); //�Է¹��� �� B
		
		int a = (A % 10) * 100 + ((A % 100)/10) * 10 + A / 100; //���ڸ��� ���� A ������ ����
		int b = (B % 10) * 100 + ((B % 100)/10) * 10 + B / 100; //���ڸ��� ���� B ������ ����
		
		if(a > b) //���� �� ū �� ����ϱ� 
			System.out.println(a);
		else
			System.out.println(b);
		
		/*
		 * charAt() ����� ���
		String A = input.next();
		String B = input.next();
		
		int a = (A.charAt(2)-'0') * 100 + (A.charAt(1)-'0') * 10 + A.charAt(0)-'0'; //���ڸ��� ���� A ������ ����
		int b = (B.charAt(2)-'0') * 100 + (B.charAt(1)-'0') * 10 + B.charAt(0)-'0'; //���ڸ��� ���� B ������ ����
		
		if(a > b) //���� �� ū �� ����ϱ� 
			System.out.println(a);
		else
			System.out.println(b);
		*/
	}
}
