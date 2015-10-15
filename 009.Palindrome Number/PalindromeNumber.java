package leetcode.easy;


/**
 * 
 * �ж��Ƿ��ǻ�������Ҫ��ռ临�Ӷ�ΪO(1)
 *
 */
public class PalindromeNumber {
	
	
	//ʱ�临�Ӷ�O(1),�ռ临�Ӷ�O(1)
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
