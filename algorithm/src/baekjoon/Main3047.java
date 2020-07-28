package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main3047 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자를 배열에 담기
		String[] nums = br.readLine().split(" ");
		
		Arrays.sort(nums);
		
		// 출력 순서 알파벳 문자열에 담기
		char[] orders = br.readLine().toCharArray();
		
		// 순서대로 숫자 출력
		for (char order: orders) {
			System.out.print(nums[order - 'A'] + " ");
		}
		
	}
}
