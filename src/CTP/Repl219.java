package com.CTP;

/*
Count how many times a given word from a list is present as prefix in another list both lists will be given as input to the function

You have to implment a method that takes two lists as input one list contains the query words that we want to search from the other list.

Word List ["steve","stevens","danny","steves","dan","john","johny" ,"joe" ,"alex" ,"alexander"]

Query Word List ["steve","alex","joe","john","dan"]

output

[2, 1, 0, 1, 1]

As word steve is present as prefix in word stevens and steves so we get 2 for it note we are not counting if we have the exact word in the original list

word alex is prefix in alexander so we get 1

word joe is not present as prefix so we get 0
 */



import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Repl219 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> namesList=Arrays.asList("steve","stevens","danny","steves","dan","john","johny" ,"joe" ,"alex" ,"alexander");
        List<String> queryList=Arrays.asList("steve","alex","joe","john","dan");
        System.out.println(countOnlyPrefixes(namesList,queryList));

    }

    public static List<Integer> countOnlyPrefixes(List<String> names,List<String> query){
    List<Integer> prefixCountList=new ArrayList<>();
    Integer count=0;
    for(String queryStr : query) {
        for (String nameStr:names) {
            if (nameStr.startsWith(queryStr)&& !(nameStr.equals(queryStr))) {
                count++;
            }
        }
        prefixCountList.add(count);
        count=0;
    }
    return prefixCountList;
    }
}
