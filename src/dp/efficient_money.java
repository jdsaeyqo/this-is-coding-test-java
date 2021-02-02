package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class efficient_money {
	


    public static void main(String[] args) throws IOException{
 
   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   StringTokenizer st = new StringTokenizer(br.readLine());
    
  
   int n = Integer.parseInt(st.nextToken());
   int m = Integer.parseInt(st.nextToken());
   
   int[] type = new int[n];
   int[] money = new int[m+1];

   for (int i = 0; i < n; i++) {
	   st = new StringTokenizer(br.readLine());
	   type[i] = Integer.parseInt(st.nextToken());
	   
}
   Arrays.fill(money, 10001);
   money[0] = 0;
   
   for (int i = 0; i < type.length; i++) {
	for (int j = type[i]; j < money.length; j++) {
		if(money[j-type[i]] != 10001) {
			money[j] = Math.min(money[j], money[j-type[i]]+1);
		}
	}
}
   
   if(money[m] == 10001) {
	   System.out.println(-1);
	   
   }else System.out.println(money[m]);
   
   
   

   
}     
}