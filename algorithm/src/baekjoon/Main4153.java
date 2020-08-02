package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main4153 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder result = new StringBuilder();
		int[] arr = new int[3];
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[0] = Integer.parseInt(st.nextToken());
			arr[1] = Integer.parseInt(st.nextToken());
			arr[2] = Integer.parseInt(st.nextToken());
			
			if (arr[0] == 0) break;
			
			Arrays.sort(arr);
			
			if (Math.pow(arr[2], 2) == Math.pow(arr[0], 2)+ Math.pow(arr[1], 2)) {
				result.append("right" + "\n");
				continue;
			}
			
			result.append("wrong" + "\n");
			
		};
		
		System.out.println(result);
		
	}
}
