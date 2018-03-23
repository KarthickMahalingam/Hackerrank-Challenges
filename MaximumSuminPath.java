/*package whatever //do not write package name here */
// This program prints the maximum sum that can be obtained while traversing from arr[0][0] --> arr[last][last]

import java.io.*;

class MaxiumSuminPath {
    public static int[][] getMaximumSum(int[][] arr){
        int sum[][] = new int[arr.length][arr[0].length];
        for(int i = 0; i <  arr.length; i++){
            int temp = 0;
            for(int j = 0; j <  arr[i].length; j++){
                if(i == 0){
                  sum[i][j] = temp + arr[i][j];  
                  temp = sum[i][j];
                }else if (j == 0){
                    sum[i][j] = arr[i][j] + sum[i-1][j];
                }
                else{
                    sum[i][j] = arr[i][j] + Math.max(sum[i-1][j],sum[i][j-1]);
                }
            }
        }
        return sum;
    }
    
    public static void printResult(int temp[][]){
        for(int i=0; i< temp.length; i++){
		    for(int j=0; j< temp[i].length; j++){
		        System.out.print(temp[i][j]+"  ");
		    }
		    System.out.println();
		}
		
		System.out.println("Maximum sum from longest route: " + temp[temp.length-1][temp[0].length-1]);
    }
    
	public static void main (String[] args) {
		int arr[][] = {
		    {1, 2, 3, 4},
		    {2, 3, 4, 5},
		    {6, 7, 8, 9},
		    {4, 5, 6, 7}
		};
		
		printResult(getMaximumSum(arr));
		
		int[][] arr1 = {
		                {1, 2, 3},
		                {4, 5, 6}
		               };
		printResult(getMaximumSum(arr1));
	}
}
