package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1065 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int result = n;
		
		if (n >= 100) {
			result = 99;
			
			for (int i = 100; i <= n; i++) {
				if((i % 100 / 10) - (i / 100) == (i % 10) - (i % 100 / 10)) {
					result++;  
				}
			}
		}
		System.out.println(result);
	}
}
