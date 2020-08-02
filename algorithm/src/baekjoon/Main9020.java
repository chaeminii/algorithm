package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main9020 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		
		int t = Integer.parseInt(br.readLine());
		int n = 0;
		
		for (int i = 0; i < t; i++) {
			 n = Integer.parseInt(br.readLine());
			 boolean[] arr = new boolean[n + 1];
			 for (int j = 2; j < n; j++) {
				 if (getDecimal(j)) {
					 arr[j] = true;
				 };
			 }
			 for (int j = arr.length / 2; j >= 2; j--) {
				 if (arr[j] && arr[n - j]) {
					 result.append(j + " " + (n - j) + "\n");
					 break;
				 }
			 }
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
