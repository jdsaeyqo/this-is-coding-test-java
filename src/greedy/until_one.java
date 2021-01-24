package greedy;

import java.util.Scanner;

public class until_one {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		
		
		while(num != 1) {
			if(num % num1 == 0) {
				num /=num1;
				cnt++;
			}else {
				num-=1;
				cnt++;
			}
		}
		System.out.println(cnt);
		
		}
}
