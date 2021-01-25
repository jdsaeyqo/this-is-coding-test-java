package greedy;

class reverse_string{
	public int reverse(String s){
		
		int zero_to_one = 0;
		int one_to_zero = 0;
		
		
		for (int i = 0; i < s.length();) {
			char num = s.charAt(i);
			if(num == '0') {
				zero_to_one++;
			}else one_to_zero++;
			
			i++;
			
			while(i < s.length() && s.charAt(i) == num) {
				i++;
			}

	}
		
		return Math.min(zero_to_one, one_to_zero);
}
}
public class string_reverse {
public static void main(String[] args) {
	
	reverse_string rs = new reverse_string();
	System.out.println(rs.reverse("0001100"));
	
}
}
