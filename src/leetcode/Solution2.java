package leetcode;

class Solution2 {
    public static int totalMoney(int n) {
        int mondayAmount = 0 ;
        int sum = 0;
       int count = 0;
       int noOfweeks = n/7;
       noOfweeks  ++;
       

       for(int i = 0 ; i < noOfweeks ; i++){
    	   if(n > 0) {
    		   mondayAmount++ ;
    	         n--;
    	        count++;
    	         sum = sum + mondayAmount;
    	         int prevamount = mondayAmount;
    	         System.out.println("prev amount is" + prevamount);
    	         System.out.println("sum till now " + sum);
        
         for(int j = 0 ; j < 6 ; j++ ){
            if(n > 0){
            prevamount = prevamount + 1;
           
            sum = sum + ( prevamount);
            n--;
            count++;
            }
            
         }
         System.out.println("n left is" + n);
         
       }
       }
       
       System.out.println("count" + count);
    return sum;
       
    }
    
    public static void main(String args[]) {
    	int ans = totalMoney(175);
    	System.out.println(ans);    
    	}
    /////
}
