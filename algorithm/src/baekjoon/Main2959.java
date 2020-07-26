package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2959 {
	public int max = 0;

	public static void main(String[] ar) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Main2959 main = new Main2959();
		int[] arr = new int[st.countTokens()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(main.calculateArea(arr, 0));
	}

	public int calculateArea(int[] arr, int start) {
		int length = arr.length;
		int[] step = new int[length];

		if (start == length - 1) {
			for (int i = 0; i < length; i++) {
				step[i] = arr[i];
			}

			if (step[0] <= step[2] && step[1] <= step[3]) {
				int area = step[0] * step[1];
				if (max < area)
					max = area;
			}
			return max;
		}

		for (int i = start; i < length; i++) {
			swap(arr, start, i);
			calculateArea(arr, start + 1);
			swap(arr, start, i);
		}
		return max;
	}

	public void swap(int[] arr, int n1, int n2) {
		int temp = arr[n1];
		arr[n1] = arr[n2];
		arr[n2] = temp;
	}
}
