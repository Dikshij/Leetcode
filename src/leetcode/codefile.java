package leetcode;

import java.util.ArrayList;
import java.util.List;

public class codefile{
    static int solve(int n,int m, List<List<Integer>>  input){
        int[][] ans = new int[n][m];
        int count =0;
        for(int i = 0 ;i < n;i++){
            for(int j = 0 ;j < m;j++){
                if(j == 0){
                	System.out.println(input.get(i).get(j));
                    ans[i][j] = ans[i][j] + input.get(i).get(j);
                    System.out.println("****" + ans[i][j]);
                }
                else{
                	System.out.println(input.get(i).get(j));
                    ans[j][i] = ans[j][i] + input.get(i).get(j);
                }
            }
        }
       for(int i = 0 ; i < n ; i++){
        for(int j = 0 ; j < m ; j++){
            System.out.println("/////"+ans[i][j]);
            if((ans[i][j]%2)==1){
                count++;
            }
        }
       }
       return count;
    }
    
    public static void main(String[]args) {
    	List<List<Integer>> aa = new ArrayList<>();
    	List<Integer> n = new ArrayList<>();
    	n.add(0);
    	n.add(1);
    	aa.add(n);
    	n = new ArrayList<>();
    	n.add(1);
    	n.add(1);
    	aa.add(n);
    	int ans = solve(3,2,aa);
    	System.out.println(ans);
    }
}
