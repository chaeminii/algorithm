package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2798 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(getSum(arr, m));
	}
	
	static int getSum(int[] arr, int m) {
		int length = arr.length;
		int sum = 0;
		int result = 0;
		for (int i = 0; i < length - 2; i++) {
			for (int j = i + 1; j < length - 1; j++) {
				for (int k = j + 1; k < length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if (m == sum) return sum;
					else if (m < sum) continue;
					else {
						if (result < sum) {
							result = sum;
						}
					}
				}
			}
		}
		return result;
	}

}
