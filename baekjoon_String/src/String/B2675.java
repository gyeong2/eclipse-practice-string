package String;

import java.util.Scanner;

public class B2675 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int T = input.nextInt(); //�׽�Ʈ ���̽��� ����
		
		for(int i = 0; i<T; i++) {
			
			int R = input.nextInt(); //�ݺ��� Ƚ��
			String S = input.next(); //�Է¹��� ���ڿ�
					
			for(int j = 0; j<S.length(); j++) {
				for(int k = 0; k<R; k++) {
					System.out.print(S.charAt(j));
				}
			}
			
			System.out.println();
			
		}
	}
}
