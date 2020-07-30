package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main1181 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>();
		String str;
		for (int i = 0; i < n; i++) {
			str = br.readLine();
			if (!list.contains(str)) {
				list.add(str);
			}
		}
		
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() != o2.length()) {
					return o1.length() - o2.length();
				} else {
					for (int i = 0; i < o1.length(); i++) {
						if ((char)o1.charAt(i) - (char)o2.charAt(i) != 0) {
							return (char)o1.charAt(i) - (char)o2.charAt(i);
						}
					}
					
				}
				
				return 0;
			}
		});
		
		StringBuffer sb = new StringBuffer();
		for (String s : list) {
			sb.append(s + "\n");
		}
		System.out.println(sb);
	}
}
