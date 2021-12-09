package com.CTP;
/*
Reverse the number

Input[123] ->output [321]

Input[12345] ->output [54321]

Input[1001] ->output [1001]

Input[789] ->output [987]
 */
public class Repl225 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int input=12345;
        System.out.println(reverseInteger(input));
    }
    public  static int reverseInteger(int N){
    String str=Integer.toString(N);
    StringBuilder sb=new StringBuilder(str);
    return Integer.parseInt(sb.reverse().toString());
    }
}
