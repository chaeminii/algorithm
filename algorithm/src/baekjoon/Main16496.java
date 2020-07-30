package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Main16496 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().trim().split(" ");
		
		Arrays.sort(arr, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2);
			}
		});
		
		if (arr[0].equals("0")) {
			bw.append("0");
		} else {
			for (String s : arr) {
				bw.append(s);
			}
		}
		
		bw.flush();
		bw.close();
	}
}
