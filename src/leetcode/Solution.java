package leetcode;

public class Solution {
	
	public static void main(String[] args) {
		System.out.println("Hi");
		int[] a = {3,2,3};
				//a = [3,3,4];
		int ans = majorityElement(a);
		System.out.println(ans);
	}
	
	public static int majorityElement(int[] a) {

        int numcount = 0;
        int value = 0;
        int maxnumber = 0;
        int temp =0;
        //int[] temparr = new int[a.length]

        for(int i = 0 ;i < a.length; i++){
            for(int j = i+1;j <a.length ; j++){
            	if(a[i] > a[j]){
            		temp=0;
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        for(int i = 0 ;i < a.length; i++){
           
            System.out.println(a[i]);
        }

        if (a.length%2 == 0){
            value = a[a.length/2];
        }
        else
            value = a[(a.length-1)/2];

        return value;
               
    }

}
