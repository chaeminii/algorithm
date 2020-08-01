package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main4948 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		int n = 0;
		while((n = Integer.parseInt(br.readLine())) != 0) {
			int count = 0;
			for (int i = n + 1; i <= 2 * n; i++) {
				if (getDecimal(i)) {
					count++;
				}
			}
			result.append(count + "\n");
		}
		
		System.out.println(result);
	}
	
	static boolean getDecimal(int num) {
		if (num == 1) return false;
		for (int i = 2; i <= Math.sqrt((double)num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
