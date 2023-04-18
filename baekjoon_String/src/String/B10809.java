package String;

import java.util.Scanner;

public class B10809 {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[26];
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1; 
		}
		
		String word = input.next(); //입력받을 단어
		
		for(int i=0; i<word.length(); i++) {
			char ch = word.charAt(i);
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
