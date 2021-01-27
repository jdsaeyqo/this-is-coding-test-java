package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;



public class elements_change {
	
    public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st = new StringTokenizer(br.readLine());
      
     int size = Integer.parseInt(st.nextToken());
     int num = Integer.parseInt(st.nextToken());
     
     int[] a = new int[size];     
     Integer[] b = new Integer[size];  
     
     st = new StringTokenizer(br.readLine());
     for (int i = 0; i < size; i++) {
		a[i] = Integer.parseInt(st.nextToken());
	}
     
     st = new StringTokenizer(br.readLine());
     for (int i = 0; i < size; i++) {
    	b[i] = Integer.parseInt(st.nextToken());
     }
     
     Arrays.sort(a);
     Arrays.sort(b,Collections.reverseOrder());
    
     for (int i = 0; i < num; i++) {
    	 if(a[i]<b[i]) {
    		 
    	 int tmp = a[i];
		 a[i]= b[i];
		 b[i] = tmp;
    	 }
    	 else break;
	}
     
     int sum = 0;
     for (int i = 0; i < a.length; i++) {
		sum+=a[i];
	}
   
     System.out.println(sum);
     
  
    }     
}