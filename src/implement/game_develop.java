package implement;

import java.util.Scanner;

public class game_develop {
	public static void main(String[] args) {
	    
	       Scanner sc = new Scanner(System.in);
	       
	       
	       int row = sc.nextInt();
	       int col = sc.nextInt();
	       
	       int x = sc.nextInt();
	       int y = sc.nextInt();
	       int see = sc.nextInt();
	       int[][] map = new int[row][col];
	       boolean[][] visit = new boolean[row][col];
	       
	       
	       for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				int a = sc.nextInt();
				map[i][j] = a;
			}
		}
	       
	       visit[x][y]= true;
	       
	       int turn = 0;
	       int visit_cnt = 1;
	       
	       int[] dx = { 0,1,0,-1 };
	       int[] dy = { -1,0,1,0 };
	       
	       while(true) {
	    	   see-=1;
	    	   if(see < 0) {
	    		   see = 3;
	    	   }
	    	   
	    	   if((map[x+dx[see]][y+dy[see]] == 0)&&(visit[x+dx[see]][y+dy[see]]==false)) {
	    		   visit[x+dx[see]][y+dy[see]] = true;
	    		   visit_cnt++;
	    		   
	    		   x+=dx[see];
	    		   y+=dy[see];
	    		   
	    		   turn=0;
	    	   }else {
	    		   turn++;
	    	   }
	    	   if(turn == 4) {
	    		   if(map[x-dx[see]][x-dy[see]] == 1) {
	    			   break;
	    		   }else {
	    			   turn = 0;
	    			   x -= dx[see];
	    			   y -= dy[see];
	    		   }
	    	   }
	    	   
	    	 
	       }
	       System.out.println(visit_cnt);
	    }     
}
