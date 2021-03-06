package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Main2750 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Set<Integer> set = new TreeSet<>();
		
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(br.readLine()));
		}
		
		for (int i : set) {
			System.out.println(i);
		}
	}
}
