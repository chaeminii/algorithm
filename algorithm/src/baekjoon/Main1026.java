package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main1026 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] a = br.readLine().split(" ");
		String[] b = br.readLine().split(" ");
		
		Arrays.sort(a, Collections.reverseOrder());
		Arrays.sort(b);
		
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(a[i]) * Integer.parseInt(b[i]);
		}
		
		System.out.println(sum);
	}
}
