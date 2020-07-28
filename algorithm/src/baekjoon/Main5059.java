package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main5059 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 테스트 케이스 수
		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) {
			// 구입하는 물건의 수
			int n = Integer.parseInt(br.readLine());
			
			// 구입하는 물건의 가격
			String[] costs = br.readLine().split(" ");
			
			Arrays.sort(costs, Collections.reverseOrder());
			
			int discount = 0;
			
			for (int j = 2; j < costs.length; j = j + 3) {
				discount += Integer.parseInt(costs[j]);
			}
			
			System.out.println(discount);
		}
	}
}
