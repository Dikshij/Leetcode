package leetcode;

public class ShuffleArray {
	
	public static void main(String[] args) {
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		shuffle(nums,n);
		
	}
	
	public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int j=0;
        for(int i = 0 ; i < n ; i++){
            ans[j] = nums[i];
            j = j+2;
        }
        
        for(int i=0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
        j=1;
        for(int i = n  ; i < nums.length ; i++){
           
            ans[j] = nums[i];
            System.out.print(ans[j] + " ");
            j = j+2;
        }
        System.out.println();
        for(int i=0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        return ans;
    }

}
