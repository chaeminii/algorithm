package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1436 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String numOfEnd = "666";
		int count = 0;
		int movie = 0;
		
		for (int i = 666; count < n; i++) {
			if (String.valueOf(i).contains(numOfEnd)) {
				movie = i;
				count++;
			}
		}
		
		System.out.println(movie);
	}
}
