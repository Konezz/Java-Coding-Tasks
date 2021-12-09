package com.CTP;
/*
Find the largest even length word from a String if there are two words with
 same largest even length return the first one. if there are not even words return -1
input ["find MaxLen Even"]
output ["MaxLen"]
input["I am very Good at Java"]
output ["very"]
input["I was"]
output ["-1"]
 */
public class Repl221 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String input="I was was";
        System.out.println(findMaxLenEven(input));
    }

    public static String findMaxLenEven(String str){
        String [] strArr=str.split("[ .,;:-]");
        String output=null;
        int count=0;
        for(int i=0;i<strArr.length;i++){
            for(int j=0;j<strArr.length;j++){
                if(strArr[i].equals(strArr[j])){
                    count++;
                }
            }
            if(count>1){
                output=strArr[i];

            }
        }






//    String output=null;
//    String[] strArr=str.split(" ");
//    int maxWordLength=0;
//    for(String word:strArr){
//        int wordLength=word.length();
//        if(wordLength%2==0 && maxWordLength<wordLength){
//            maxWordLength=wordLength;
//            output=word;
//        }   else if(wordLength%2==1 && output==null){
//            output="-1";
//        }
//    }
    return output;
    }
}
