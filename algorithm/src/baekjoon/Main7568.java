package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main7568 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		int[] result = new int[n];
		Arrays.fill(result, 1);

		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i][0] > arr[j][0] && arr[i][1] > arr[j][1]) {
					result[j]++;
				} else if (arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					result[i]++;
				}
			}
		}
		for (int r : result) {
			sb.append(r + " ");
		}
		System.out.println(sb);
	}
}
