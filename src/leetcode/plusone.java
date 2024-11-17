package leetcode;

public class plusone {
	
	public static void main(String[] args) {
		System.out.println("Hi");
		//int[] a = {3,2,9};
		//int[] a = {5,6,2,0,0,4,6,2,4,9};
				//a = [3,3,4];
		//int[] ans = plusOne(a);
		 //for(int i = 0 ; i < ans.length ;i++){
	       //    System.out.print(".."+ans[i]);
	        //}
		boolean result =isPowerOfThree(2069870691);
		System.out.println(result);
		
	}
	
	public static int[] plusOne(int[] digits) {
        String sum = "0" ;

       if ((digits[digits.length -1]) != 9){
        int num = digits[digits.length -1];
        digits[digits.length -1] = num+1;
         
       }
       else 
       {
    	   int[] newArr = new int[digits.length+1];
        for(int i = 0 ; i< digits.length ;i ++){
            sum = sum + digits[i];
        }
        	System.out.println(sum);
        	int num =Integer.parseInt(sum);
        	
        	
        //int num = Integer.parseInt(sum);
        num = num+1;
        System.out.println(num);
        String s = Integer.toString(num); 
        System.out.println(s);

        int[] intArray = new int[s.length()]; 


        for(int i=0; i<s.length(); i++){
            intArray[i] = Character.getNumericValue(s.charAt(i));
        }
        
        
        return intArray;


       }
       

       return digits;

        
    }
	
	public static boolean isPowerOfThree(int n) {
        long result =1;
        if(n == 1){
            return true;
        }

       

        for(int i = 1; i <= n/3 ;i=i+2 ){
             result = result * 3;
             System.out.println(result);
             
            if( result == n){
                return true;
            }

            if(result > n){
                return false;
            }
        }
        return false;
    }
	
	//I am adding some comment here 

}
