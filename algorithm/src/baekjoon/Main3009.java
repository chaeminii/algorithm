package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main3009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> horizon = new ArrayList<>();
		List<Integer> vertical = new ArrayList<>();
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			if (horizon.contains(x)) {
				horizon.remove(horizon.indexOf(x));
			} else {
				horizon.add(x);
			}
			
			if (vertical.contains(y)) {
				vertical.remove(vertical.indexOf(y));
			} else {
				vertical.add(y);
			}
		}
		
		System.out.println(horizon.get(0) + " " + vertical.get(0));
		
	}
}
