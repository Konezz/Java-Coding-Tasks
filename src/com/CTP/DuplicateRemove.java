package com.CTP;

import java.util.ArrayList;
import java.util.HashSet;

/*
How can you remove all duplicates from ArrayList?
 */
public class DuplicateRemove {
    public static void main(String[] args) {
        ArrayList<String> aList = new ArrayList<>();
        aList.add("John");
        aList.add("Jane");
        aList.add("James");
        aList.add("Jasmine");
        aList.add("Jane");
        aList.add("James");

        HashSet<String> removed=new HashSet<>(aList);
        System.out.println(removed);
    }
}
