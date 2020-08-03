package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2231 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = new int[n + 1];
		int num = 0;
		for (int i = 1; i <= n; i++) {
			num = i + getConstructor(i);
			if (num > n) continue;
			if (arr[num] != 0) {
				arr[num] = Math.min(arr[num], i);
				continue;
			}
			
			arr[num] = i;
		}
		
		System.out.println(arr[n]);
	}
	
	static int getConstructor(int n) {
		
		while(true) {
			if (n == 0) return 0;
			return (n % 10) + getConstructor(n / 10);
		}
	}
}
