package leetcode;

public class Solution {
	public static void main(String[] args){
		System.out.println("hello leetcode");
		int[] nums = {0,1,0,3,12};
		System.out.println(nums.toString());
		moveZeroes(nums);
	}
	
    public static void moveZeroes(int[] nums) {
    	//283
    	int temp;
    	for(int i=0;i<nums.length ;i++){
    		if(nums[i]==0){
    			for(int j=i;j<nums.length;j++){
    				if(nums[j] != 0){
	    				temp = nums[i];nums[i] = nums[j];nums[j] = temp;
	    				break;
    				}		
    			}
    		} 		
    	}
    	for(int i = 0; i < nums.length ;i++){
    		System.out.print(nums[i]+",");
    	}
        
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
