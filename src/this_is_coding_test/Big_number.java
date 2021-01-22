package this_is_coding_test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Big_number {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int size = sc.nextInt();
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		Integer[] arr = new Integer[size];
		
		for (int i = 0; i < size; i++) {
			int ar = sc.nextInt();
			arr[i] = ar;
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		int cnt = arr[0] * num1*(num/num1) + arr[1]*(num%num1);
		System.out.println(cnt);
	}

}
