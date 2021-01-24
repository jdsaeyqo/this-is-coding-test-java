package implement;

import java.util.Scanner;

public class up_down_left_right {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
		
		
		int row = 1;
		int col = 1;
		
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'R') {
				if(col != size) {
				col+=1;
				}
				
			}else if(str.charAt(i) == 'L') {
				if(col != 1) {
					col-=1;
				}
				
			}else if(str.charAt(i) == 'U') {
				if(row != 1) {
					row-=1;
				}
				
			}else if(str.charAt(i) == 'D') {
				if(row != size) {
					row+=1;
				}
			}
		}
		
		System.out.println(row+" "+col);
		
		
		
		}
}
