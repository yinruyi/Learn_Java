package leetcode;

public class Solution {
	public static void main(String[] args){
		System.out.println("hello leetcode");
		addDigits(19);
	}
	
	
	public static int addDigits(int num){
		//258
		String s = String.valueOf(num);
		int sum = 0;
		char item;
		for(int i = 0 ;i<s.length() ;i++){
			item = s.charAt(i);
			sum += Integer.parseInt(String.valueOf(item));
		}
		if(String.valueOf(sum).length()>1){
			sum = addDigits(sum);
		}
		System.out.println(sum);
		return sum;
	}
	
	public static boolean canWinNim(int n){
		//292
		return (n%4) > 0 ? true:false;
	}
}
