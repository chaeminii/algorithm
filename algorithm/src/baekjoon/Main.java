package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int length = str.length();
		char c = '0';
		char next = '0';
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (i == str.length() - 1) break;
			next = str.charAt(i + 1);
			if (c == 'c' && (next == '=' || next == '-')) {
				length--;
			} else if ((c == 's' || c == 'z') && next == '=') {
				length--;
			} else if (c == 'd') {
				if (i != str.length() -2 && (next == 'z' && str.charAt(i + 2) == '=')) {
					length--;
				} else if (next == '-') {
					length--;
				}
			}
		}
		System.out.println(length);
		
	}
}
