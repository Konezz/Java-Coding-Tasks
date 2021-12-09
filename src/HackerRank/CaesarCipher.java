package com.HackerRank;

public class CaesarCipher {
    public static void main(String[] args) {
    String input="z-caesarz";
        System.out.println(caesarCipher(input,3));
    }
    public static String caesarCipher(String s, int k) {
        // Write your code here
        String cipher=null;
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb=new StringBuilder();
        String[] inputArr=s.split("[^a-zA-z]");
        for(String inputStr:inputArr) {
            for (int i = 0; i < inputStr.length(); i++) {
                int newIndex = alphabet.indexOf(inputStr.charAt(i)) + k;
                if (newIndex > alphabet.length()) {
                    sb.append(alphabet.charAt(newIndex - alphabet.length()));
                } else {
                    sb.append(alphabet.charAt(newIndex));
                }
            }
        }
    return sb.toString();
    }
}
