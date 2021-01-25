package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class impossible_money {
public static void main(String[] args) throws IOException {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int num = Integer.parseInt(st.nextToken());
	Integer[] money_type = new Integer[num];
	
	st = new StringTokenizer(br.readLine());
	for (int i = 0; i < money_type.length; i++) {
		money_type[i] = Integer.parseInt(st.nextToken());
	}
	
	Arrays.sort(money_type,Collections.reverseOrder());
	//9 3 2 1 1
	int min = money_type[num-1];
	
	while(true) {
		int tmp = min;
			//1 
		for (int i = 0; i < money_type.length; i++) {
			if(tmp >= money_type[i]) {
				tmp-= money_type[i];
			}
			if(tmp == 0) {
				break;
			}
		}
		
		if(tmp>0) {
			break;
		}
		min++;
	}
	
	System.out.println(min);

}
}
