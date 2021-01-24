package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class card__number_game {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	
	int max = 0;
	
	int row = sc.nextInt();
	int col = sc.nextInt();
	
	int[] min_arr = new int[col];
	int[] max_arr = new int[row];
	
	for (int i = 0; i < row; i++) {
		for (int j = 0; j < col; j++) {
			int num = sc.nextInt();
			min_arr[j] = num;
		}
		Arrays.sort(min_arr);
		max_arr[i]=min_arr[0];
		
	}
	Arrays.sort(max_arr);
	max = max_arr[row-1];
	System.out.println(max);
	
	
	
	}
}