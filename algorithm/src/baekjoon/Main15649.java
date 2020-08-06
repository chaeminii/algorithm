package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main15649 {
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int r = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		int[] output = new int[n];
		boolean[] visited = new boolean[n];

		for (int i = 1; i <= n; i++) {
			arr[i - 1] = i;
		}

		perm(arr, output, visited, 0, n, r);

		bw.flush();
		bw.close();
	}

	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) throws IOException {
		if (depth == r) {
			print(output, r);
			return;
		}

		for (int i = 0; i < n; i++) {
			if (visited[i] != true) {
				visited[i] = true;
				output[depth] = arr[i];
				perm(arr, output, visited, depth + 1, n, r);
				output[depth] = 0; // 이 줄은 없어도 됨
				visited[i] = false;
				;
			}
		}
	}

	static void print(int[] arr, int r) throws IOException {
		for (int i = 0; i < r; i++)
			bw.append(arr[i] + " ");
		bw.append("\n");
	}
}
