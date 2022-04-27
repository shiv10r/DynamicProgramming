package com.shrgfg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Coin  change  problem: Find the
    /*
      public  int  coinChange(int[]  coins, int  amount){
          int  dp[] =  new int[amount+1];
            Arrays.fill(dp,  amount+1);
              dp[0] = 0;
                for(int  coin :  coins){
                      for(int  i=coin;i<=amount;i++){
                            dp[i] =  Math.min(dp[i],  dp[i-coin] +1);
                      }
                }
                  return  dp[amount] <=  amount ?  dp[amount] : -1;
      }

     */
        //Longest  Increasing  sub sequence : [10,9,2,5,3,7,101,18]  4
        //Explanation: The longest increasing subsequence is [2,3,7,101], therefore the length is 4.
        // A subsequence is a sequence that can be derived from an array by deleting some or no elements
        // without changing the order of the remaining elements. For example, [3,6,2,7] is a subsequence of the array [0,3,1,6,2,2,7]
    /*  Scanner sc=  new  Scanner(System.in);
        int  n=  sc.nextInt();
            int  arr[] =  new int[n];
                 for(int i=0;i<n;i++) {
                     arr[i]= sc.nextInt();
                 }
                   int omax =0;
                   int  dp[] =  new int[n];
                     for(int  i=0;i<dp.length;i++){
                             int  max =0;

                               for(int  j=0;j<i;j++){
                                     if(arr[j] <  arr[i]){
                                           if(dp[j] >  max){
                                                 max =  dp[j];
                                           }
                                     }
                               }
                                 dp[i] =  max +1;
                                 if(dp[i]  > omax){
                                        omax = dp[i];
                                 }
                     }
        System.out.println(omax);

                 }
}

     */
        //A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
        //
        //    For example, "ace" is a subsequence of "abcde".
        //
        //A common subsequence of two strings is a subsequence that is common to both strings.
        //Input: text1 = "abcde", text2 = "ace"
        //Output: 3
        //Explanation: The longest common subsequence is "ace" and its length is 3.
//
//   more  consise  code  for lcs:
//
//          public int lcs(String text1 , String  text2){
          //     int  n =  text1.length();
         //  int m =  text2.length();
//					  int  dp[] =  new int[n +1][m +1];
//						  for(int  i=0;i<= n;i++){
//							  for(int  j=0;j<=m;j++){
//								  if(i == 0 ||  j == 0){
//									  continue;
//									}
//									  if(text1.charAt(i-1) ==  text2.charAt(j-1)) {
//										  dp[i][j] =  1 +  dp[i-1][j-1];
//											 }
//											   else{
//												   dp[i][j] =  Math.max(dp[i-1][j] , dp[i][j-1]);
//													 )
//													 }
//													 }
//													   return  dp[n][m];
//									}
//									}
//						}
        class Solution {
            public int longestCommonSubsequence(String text1, String text2) {
                int  n=  text1.length();
                int m =  text2.length();

                int  dp[][] =   new  int[n+1][m+1];
                for(int i= dp.length-2;i>=0;i--){    //length-2  =  second last  row
                    for(int j= dp[0].length-2;j>=0;j--){
                        if(text1.charAt(i) ==  text2.charAt(j)){
                            dp[i][j] =1+dp[i+1][j+1];
                        }else{
                            dp[i][j] = Math.max(dp[i+1][j],dp[i][j+1]);
                        }
                    }
                }
                return  dp[0][0];
            }
        }

    }
}