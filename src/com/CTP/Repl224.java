package com.CTP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Remove Consecutive duplicates
Write the logic to remove only consecutive duplicates

input ["aabbcde"]-> output["abcde"]

input ["aabbcc"]-> output["abc"]

input ["aabbcca"]-> output["abca"]

input ["aabbccaddda"]-> output["abcada"]
 */
public class Repl224 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String input = "aabbccaddda";
        System.out.println(removeConsecutiveDuplicates(input));
    }

    public static String removeConsecutiveDuplicates(String input) {
        StringBuilder sb = new StringBuilder();
        char startChar=' ';
        for (int i = 0; i < input.length(); i++) {
            char checkChar = input.charAt(i);
            if (checkChar != startChar) {
                startChar = checkChar;
                sb.append(checkChar);
            }
        }
        return sb.toString();
    }
}
