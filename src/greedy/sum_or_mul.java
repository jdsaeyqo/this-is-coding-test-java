package greedy;

class sum_mul{
	public int solution(String s) {
		
		
		int[] arr = new int[s.length()];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.charAt(i) - '0';
		}
		int result = arr[0];
		

		for (int i = 1; i < arr.length; i++) {
			int sum = result+arr[i];
			int mul = result*arr[i];
			result = ( sum > mul ) ? sum : mul;
		}

		return result;
	}
}


public class sum_or_mul {

	public static void main(String[] args) {
	
	sum_mul s = new sum_mul();
	System.out.println(s.solution("567"));
}
}
