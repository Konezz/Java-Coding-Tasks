package com.CTP;
/*
Find out how many alpha characters are present in a string? Find the number of
words in string?
 */
public class AlphaChars {
    public static void main(String[] args) {
        String given="sdv8 9s8d 908w30 sndc         ";
        String aplhas=given.replaceAll("[^A-Za-z]","");
        System.out.println(aplhas);
        System.out.println(given.replaceAll("[^A-Za-z]","").length());
        System.out.println(given.trim().length()-given.trim().replaceAll(" ","").length()+1);
        String[] arr=given.split(" ");
        System.out.println(arr.length);
    }

}
