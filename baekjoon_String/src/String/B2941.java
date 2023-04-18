package String;

import java.util.Scanner;

public class B2941 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String w = input.next(); //입력받을 변형된 크로아티아 단어
		int cnt = 0;
		
		for(int i = 0; i<w.length(); i++) {
			
			if(w.charAt(i) == 'c') { //i번째 글자가 c인 경우
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == '=' || w.charAt(i+1) == '-') { //다음 글자도 검사
						i++; 
					}
				}
			}
			
			else if (w.charAt(i) == 'd') { //i번째 글자가 d인 경우
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == 'z') { //다음 글자도 검사
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
			
			else if(w.charAt(i) == 'l') { //i번째 글자가 l인 경우
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == 'j') { //다음 글자
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 'n') { //i번째 글자가 n인 경우
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == 'j') { //다음 글자
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 's') { //i번째 글자가 s인 경우
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == '=') { //다음 글자
						i++; 
					}
				}
			}
			
			else if(w.charAt(i) == 'z') { //i번째 글자가 z인 경우
				if(i < w.length() - 1) {
					if(w.charAt(i+1) == '=') { //다음 글자
						i++; 
					}
				}
			}
			
			cnt++; //크로아티아 알파벳 개수 
		}
		
		System.out.println(cnt); 
	}
}
