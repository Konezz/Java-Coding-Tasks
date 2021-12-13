package com.HackerRank;
/*
Julius Caesar protected his confidential information by encrypting it using a cipher. Caesar's cipher shifts each letter
 by a number of letters. If the shift takes you past the end of the alphabet, just rotate back to the front of the alphabet.
  In the case of a rotation by 3, w, x, y and z would map to z, a, b and c.

Original alphabet:      abcdefghijklmnopqrstuvwxyz
Alphabet rotated +3:    defghijklmnopqrstuvwxyzabc
 */

public class CaesarCipher {
    public static void main(String[] args) {
    String input="z-caesarz";
        System.out.println(caesarCipher(input,3));
    }
    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char) ((s.charAt(i) + k - 'a') % 26 + 'a'));
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append((char) ((s.charAt(i) + k - 'A') % 26 + 'A'));
            } else{
                sb.append(s.charAt(i));
            }
        }
    return sb.toString();
    }
}
