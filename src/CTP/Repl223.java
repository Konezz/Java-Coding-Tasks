package com.CTP;
/*
Write logic in the main method to print a pyramid of numbers
the logic should be generic i.e. it can print the pyrmid for any numbmer like 5, 6, 7 etc
if input is
2
output should be
 2
2 2

if input is 3
the output should be
   3
  3 3
 3 3 3

Ask user input for the number for which he wants to make the pyramid using scanner
 */

import java.util.Scanner;

public class Repl223 {
    public static void main(String[] args) {
        Scanner data=new Scanner(System.in);
        int pyramidNum= data.nextInt();
        for(int i=1;i<=pyramidNum;i++) {
            for (int j =0; j < pyramidNum-i; j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(pyramidNum + " ");
            }
            System.out.println();
        }
    }
}
