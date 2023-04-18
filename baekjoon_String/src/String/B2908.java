package String;

import java.util.Scanner;

public class B2908 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt(); //입력받을 수 A
		int B = input.nextInt(); //입력받을 수 B
		
		int a = (A % 10) * 100 + ((A % 100)/10) * 10 + A / 100; //세자리수 숫자 A 역으로 변형
		int b = (B % 10) * 100 + ((B % 100)/10) * 10 + B / 100; //세자리수 숫자 B 역으로 변형
		
		if(a > b) //둘중 더 큰 수 출력하기 
			System.out.println(a);
		else
			System.out.println(b);
		
		/*
		 * charAt() 사용한 방법
		String A = input.next();
		String B = input.next();
		
		int a = (A.charAt(2)-'0') * 100 + (A.charAt(1)-'0') * 10 + A.charAt(0)-'0'; //세자리수 숫자 A 역으로 변형
		int b = (B.charAt(2)-'0') * 100 + (B.charAt(1)-'0') * 10 + B.charAt(0)-'0'; //세자리수 숫자 B 역으로 변형
		
		if(a > b) //둘중 더 큰 수 출력하기 
			System.out.println(a);
		else
			System.out.println(b);
		*/
	}
}
