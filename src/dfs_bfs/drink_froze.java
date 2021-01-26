package dfs_bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class drink_froze {
	
	public static int n,m;
	public static int[][] map = new int [1000][1000];
	
	
	public static boolean dfs(int x, int y) {
		
		if( x < 0 || x >= n || y <0 || y >= m) {
			return false;
		}
		
		if(map[x][y] == 0) {
			map[x][y] = 1;
			dfs(x-1,y);
			dfs(x,y-1);
			dfs(x+1,y);
			dfs(x,y+1);
			return true;
		}
		
		return false;
			
	}
	
	 public static void main(String[] args) throws IOException {
		    
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      
	     
	     n = Integer.parseInt(st.nextToken());
	     m = Integer.parseInt(st.nextToken());
	     
	     
	     
	     for (int i = 0; i <n; i++) {
	    	 String str = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
	     
	     int result = 0;
	     for (int i = 0; i < n; i++) {
	    	 for (int j = 0; j < m; j++) {
				if(dfs(i,j)) {
					result+=1;
				}
			}
			
		}
	      System.out.println(result);
	       
	       
	       
	    }     
	

}
