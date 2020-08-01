package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num;
		int count = 0;
		for (int i = 0; i < n; i++) {
			num = Integer.parseInt(st.nextToken());
			if (getDecimal(num)) {
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static boolean getDecimal(int num) {
		if (num == 1) return false;
		for (int i = 2; i <= Math.sqrt((double)num); i++) {
			if (num % i == 0) return false;
		}
		return true;
	}
}
