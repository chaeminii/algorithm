package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main11004 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stk.nextToken());
		}
		
		quickSort(arr, 0, arr.length - 1);
		
		System.out.println(arr[k - 1]);
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int left = start;
		int right = end;
		int pivot = arr[(left + right) / 2];  // 기준값을 배열의 인덱스 값으로 잡아준다.
		int temp;
		
		do {
			// (배열의 중간 인덱스 기준) 왼쪽의 수가 기준값보다 크고
			while (arr[left] < pivot) left++;
			
			// 오른쪽의 수가 기준값보다 작으면
			while (arr[right] > pivot) right--;
			
			// 왼쪽과 오른쪽 값을 바꿔준다.
			if (left <= right) {
				temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		
			// 왼쪽, 오른쪽 모든 값을 확인 할때까지 반복한다. 
		} while(left <= right);
		
		// 끝부터 감소시키는 수가 배열의 처음에 도달하지 않았다면 반복한다.
		if (start < right) {
			quickSort(arr, start, right);
		}
		
		// 처음부터 증가 시키는 수가 배열의 마지막에 도달하지 않았다면 반복한다.
		if (end > left) {
			quickSort(arr, left, end);
		}
	}
}
