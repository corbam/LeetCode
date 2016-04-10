package leetcode.easy;

public class RomantoInteger {

    
	public int toNumber(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return 0;
    }

	public static void main(String[] args) {
		System.out.println(new RomantoInteger().romanToInt("IV"));
	}

}
