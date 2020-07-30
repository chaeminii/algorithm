package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main10814 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		
		Member[] m = new Member[n];
		
		// 들어온 순서, 나이, 이름을 정의한 클래스 배열에 담아준다.
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m[i] = new Member(i, st.nextToken(), st.nextToken());
		}
		
		Arrays.sort(m);
		
		for (Member member : m) {
			bw.append(String.valueOf(member.age + " " + member.name) + "\n");
		}
		
		bw.flush();
		bw.close();
		
	}
}

class Member implements Comparable<Member>{
	int index;
	int age;
	String name;
	
	public Member(int index, String age, String name) {
		this.index = index;
		this.age = Integer.parseInt(age);
		this.name = name;
	}
	
	
	
	@Override
	public int compareTo(Member o) {
		if (o.age == this.age) {
			return this.index - o.index;
		}
		
		return this.age - o.age;
	}
}
