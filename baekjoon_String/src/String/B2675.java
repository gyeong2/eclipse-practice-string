package String;

import java.util.Scanner;

public class B2675 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt(); //테스트 케이스의 개수
		
		for(int i = 0; i<T; i++) {
			
			int R = input.nextInt(); //반복할 횟수
			String S = input.next(); //입력받을 문자열
					
			for(int j = 0; j<S.length(); j++) {
				for(int k = 0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
			
		}
	}
}
