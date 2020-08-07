package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] arr = br.readLine().trim().split(" ");
		int length = arr.length;
		
		for (String s : arr) {
			if (s.equals("")) {
				length--;
			}
		}
		
		bw.append(String.valueOf(length));
		bw.flush();
		bw.close();
	}
}
