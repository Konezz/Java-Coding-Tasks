package com.CTP;

public class BrailleConverter {
    public static void main(String[] args) {
        System.out.println(solution("The quick brown fox jumped over the lazy dog"));
    }
    public static String solution(String x){
        char[]charr=x.toCharArray();
        StringBuilder sb=new StringBuilder();
        String space="000000";
        String upperCase="000001";
        String[] brailleAlphabet={
             "100000",//a
             "110000",//b
             "100100",//c
             "100110",//d
             "100010",//e
             "110100",//f
             "110110",//g
             "110010",//h
             "010100",//i
             "010110",//j
             "101000",//k
             "111000",//l
             "101100",//m
             "101110",//n
             "101010",//o
             "111100",//p
             "111110",//q
             "111010",//r
             "011100",//s
             "011110",//t
             "101001",//u
             "111001",//v
             "010111",//w
             "101101",//x
             "101111",//y
             "101011",//z
        };
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<x.length();i++){
            char ch=charr[i];
            if(ch==' '){
                sb.append(space);
            } else if(Character.isUpperCase(ch)){
                sb.append(upperCase);
                sb.append(brailleAlphabet[alphabet.indexOf(Character.toLowerCase(ch))]);
            } else if(alphabet.indexOf(ch)!=-1){
                sb.append(brailleAlphabet[alphabet.indexOf(ch)]);
            }
        } 
        return sb.toString();
    }
}
