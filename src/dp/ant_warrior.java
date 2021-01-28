package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class ant_warrior {
public static void main(String[] args) throws IOException {
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int n = Integer.parseInt(st.nextToken());
	int[] food = new int[n];
	int[] sum = new int[n];
	
	st = new StringTokenizer(br.readLine());
	for (int i = 0; i < food.length; i++) {
		food[i] = Integer.parseInt(st.nextToken());
	}
	
	sum[0] = food[0];
	sum[1] = Math.max(food[0], food[1]);
	
	
	
	for (int i = 2; i < n; i++) {
		sum[i] = Math.max(sum[i-1], sum[i-2] + food[i]);
	}
	
	System.out.println(sum[n-1]);
	

			
}
}
