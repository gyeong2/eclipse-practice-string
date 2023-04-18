package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class B1152 {
	public static void main(String [] args) throws IOException {
		//Scanner input = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String s = input.next(); //입력받을 문자열 
		String s = br.readLine(); //BufferdReader로 문자열 입력받기
		int cnt = 0;
		
		for(int i = 0; i<s.length(); i++) {
			if(s.charAt(i) == ' ') {
				cnt++;
			}
		}
		
		if(s.charAt(0) == ' ')
			cnt--;
		if(s.charAt(s.length()-1) == ' ')
			cnt--; 
		
		System.out.println(cnt+1);
	}
}
