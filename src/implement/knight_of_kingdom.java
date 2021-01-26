package implement;

import java.util.Scanner;

public class knight_of_kingdom {
	public static void main(String[] args) {
	       Scanner sc = new Scanner(System.in);
	       
	      
	       String str = sc.nextLine();
	        
	       int row = str.charAt(1)-'0';
	       int col = str.charAt(0)-'a'+1;
	       int cnt = 0;
	       
	       int[] row_move = {-2,-2,-1,1,2,2,-1,1};
	       int[] col_move = {-1,1,-2,-2,-1,1,2,2};
	    	
	       for (int i = 0; i < 8; i++) {
	    	   
			if(row+row_move[i] < 1 || row+row_move[i] >8 || col+col_move[i] <1 || col+col_move[i] >8 ) {
				continue;
			}else cnt++;
		}
	       System.out.println(cnt);
	        
	    }
}
