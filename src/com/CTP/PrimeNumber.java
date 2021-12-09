package com.CTP;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=1;
        boolean prime=false;
       if(n>1) {
           for (int i = 2; i <= n; i++) {
               if (n % i == 0) {
                   break;
               } else {
                   prime = true;
               }
           }
       }
        System.out.println(prime);
    }
}
