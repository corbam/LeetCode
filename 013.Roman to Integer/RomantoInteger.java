package leetcode.test;

public class ReverseInteger {
	
	public int reverse(int x) {
		long i = 0;
		while (x > 0) {
			i = i * 10 + x % 10;
			x = x / 10;
		}
		if(i>Integer.MAX_VALUE || i<Integer.MIN_VALUE){
			return 0;
		}else{
			return (int)i;
		}
	}

	public static void main(String[] args) {		
		System.out.println(new Test().reverse(1234567899));
	}

}
