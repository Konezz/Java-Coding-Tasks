package com.CTP;

import java.util.Arrays;

public class Repl216 {
    /*
    Create an Array of size N whose elements sum to zero
ArraySumToZero(0) ->{}
ArraySumToZero(1) ->{0}
ArraySumToZero(2) ->{-1,1}
ArraySumToZero(3) ->{1,-1,0}
ArraySumToZero(4) ->{2,-2,3,-3}
N will be given as input to the function and fucntion will return an array whose element will sum to zero.
     */

        public static void main(String[] args){
            System.out.println(Arrays.toString(arraySumToZero(0)));
            System.out.println(Arrays.toString(arraySumToZero(1)));
            System.out.println(Arrays.toString(arraySumToZero(2)));
            System.out.println(Arrays.toString(arraySumToZero(3)));
            System.out.println(Arrays.toString(arraySumToZero(4)));
            System.out.println(Arrays.toString(arraySumToZero(5)));
            System.out.println(Arrays.toString(arraySumToZero(6)));
        }

        public static int[] arraySumToZero(int N) {
            int[] arr=new int[N];
            boolean teacher=true;
            if(!teacher) {
                for (int i = 0; i < N; i += 2) {
                    if (N % 2 == 0) {
                        arr[i] = (N + i) / 2;
                        arr[i + 1] = -arr[i];
                    } else if (N % 2 == 1) {
                        if (i < (N - 1)) {
                            arr[i] = (N - 1 + i) / 2;
                            arr[i + 1] = -arr[i];
                        } else {
                            arr[i] = 0;
                        }
                    }
                }
            }
            else{
                if(N==1){
                    return  new int[]{0};
                }
                int num = N/2;

                int index=0;
                while(num>0){
                    arr[index++]=num;
                    arr[index++]=num *-1;
                    num--;
                }
                if(N%2!=0){
                    arr[arr.length-1]=0;
                }
            }

            return arr;
        }
    }

