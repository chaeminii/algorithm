package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int start = Integer.parseInt(br.readLine());
		int end= Integer.parseInt(br.readLine());
		int sum = 0;
		int min = 0;
		
		for (int i = start; i <= end; i++) {
			if (getDecimal(i)) {
				if (min == 0) min = i;
				sum += i;
			}
		}
		
		if (min == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
	
	static boolean getDecimal(int num) {
		if (num == 1) return false;
		for (int i = 2; i <= Math.sqrt((double)num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
