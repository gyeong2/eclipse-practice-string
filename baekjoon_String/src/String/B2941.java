package String;

import java.util.Scanner;

public class B2941 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String w = input.next(); //�Է¹��� ������ ũ�ξ�Ƽ�� �ܾ�
		int cnt = 0;
		
		for(int i = 0; i<w.length(); i++) {
			
			if(w.charAt(i) == 'c') { //i��° ���ڰ� c�� ���
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == '=' || w.charAt(i+1) == '-') { //���� ���ڵ� �˻�
						i++; 
					}
				}
			}
			
			else if (w.charAt(i) == 'd') { //i��° ���ڰ� d�� ���
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == 'z') { //���� ���ڵ� �˻�
						if(i < w.length() - 2) {
							if(w.charAt(i+2) == '=') {
								i += 2; 
							}
						}
					}
					else if(w.charAt(i+1) == '-') {
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 'l') { //i��° ���ڰ� l�� ���
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == 'j') { //���� ����
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 'n') { //i��° ���ڰ� n�� ���
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == 'j') { //���� ����
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 's') { //i��° ���ڰ� s�� ���
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == '=') { //���� ����
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 'z') { //i��° ���ڰ� z�� ���
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == '=') { //���� ����
						i++; 
					}
				}
			}
			
			cnt++; //ũ�ξ�Ƽ�� ���ĺ� ���� 
		}
		
		System.out.println(cnt); 
	}
}
