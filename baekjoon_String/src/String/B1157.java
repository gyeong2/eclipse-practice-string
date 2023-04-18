package String;

import java.util.Scanner;

public class B1157 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next(); //입력받을 단어
		int[] arr = new int[26]; //빈도수 배열
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				arr[s.charAt(i)-65]++;
			}
			
			else {
				arr[s.charAt(i)-97]++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i < 26; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char)(i+65);
			}
			else if(arr[i] == max) {
				ch = '?';
			}
		}
		
		System.out.println(ch);
		
	}
}
