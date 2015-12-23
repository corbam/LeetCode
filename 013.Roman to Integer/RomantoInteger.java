package leetcode.easy;

public class RomantoInteger {
	
    public int romanToInt(String s) {
    	if(s.length()<1)
    		return 0;
    	int result = toNumber(s.charAt(0));
    	//����ȡ��һλ�����֣��������ұ���
    	//���С���ұߣ�˵������5Ϊ���ĵ���ߣ�һ��4����9�����֣����ۼ��ϸ�λ�������Լ�ȥ2��
    	for(int i = 1;i<s.length();i++){
    		if(toNumber(s.charAt(i-1)) < toNumber(s.charAt(i))){
    			result+= toNumber(s.charAt(i)) - 2*toNumber(s.charAt(i-1));		
    		}else{
    			result+= toNumber(s.charAt(i));
    		}  		
    	}	
		return result;   
    }
    
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
