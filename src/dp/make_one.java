package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class make_one {
public static void main(String[] args) throws IOException {
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int n = Integer.parseInt(st.nextToken());
	
	int[] sum = new int[n+1];
	
	sum[1] = 1;
	sum[2] = 3;
	for (int i = 3; i < sum.length; i++) {
		sum[i] = sum[i-1] + 2*sum[i-2];
	}
	
	System.out.println(sum[n]);
	
	
	

			
}
}
