package leetcode.easy;


/**
 * 
 * 判断是否是回文数，要求空间复杂度为O(1)
 *
 */
public class PalindromeNumber {
	
	
	//时间复杂度O(1),空间复杂度O(1)
    public boolean isPalindrome(int x) {
        if(x<0)
        	return false;
        if(x<10)
        	return true;
        
        int len = 1;
        while( x/len >= 10)
        	len = len *10;
        
        while(x>0){
        	int m = x/len;
        	int n = x%10;
        	
        	if(m!=n)
        		return false;
        	x = ( x%len )/10;
        	len = len/100;
        }
    	
    	return true;
    }

	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(121));

	}

}
