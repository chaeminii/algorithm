package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2108 {
	private static boolean flag;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		int[] count = new int[8001];
		List<Number> list = new ArrayList<>();
		double sum = 0;
		int range = 0;
		int mode = 0;
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
			count[nums[i] + 4000]++;
			sum += nums[i];
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] == 0) continue;
			Number number = new Number();
			number.setNum(i - 4000);
			number.setCount(count[i]);
			list.add(number);
		}
		
		Arrays.sort(nums);
		range = nums[nums.length - 1] - nums[0];
		
		Collections.sort(list, new Comparator<Number>() {

			@Override
			public int compare(Number o1, Number o2) {
				int result = o2.getCount() - o1.getCount();
				if (result == 0) {
					flag = true;
					result = o1.getNum() - o2.getNum();
				}
				return result;
			}
		});
		
		if (flag) {
			mode = list.get(1).getNum();
		} else {
			mode = list.get(0).getNum();
		}
		
		
		
		
		bw.append(Math.round(sum / n) + "\n");
		bw.append(nums[(n / 2)] + "\n");
		bw.append(mode+ "\n");
		bw.append(range + "");
		
		
		bw.flush();
		bw.close();
	}
}

class Number{
	private int num;
	private int count;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}