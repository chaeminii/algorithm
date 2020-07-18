package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main2908 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num1 = Integer.parseInt(st.nextToken());
		int num2 = Integer.parseInt(st.nextToken());
		
		int result = 0;
		
		num1 = (num1 % 10 * 100) + (((num1 / 10) % 10) * 10) + (num1 / 100);
		num2 = (num2 % 10 * 100) + (((num2 / 10) % 10) * 10) + (num2 / 100);
		
		if (num1 > num2) {
			result = num1;
		} else {
			result = num2;
		}
		
		bw.append(String.valueOf(result));
		bw.flush();
		bw.close();
	}
}

