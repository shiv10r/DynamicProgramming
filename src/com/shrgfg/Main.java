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
      Scanner sc=  new  Scanner(System.in);
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
