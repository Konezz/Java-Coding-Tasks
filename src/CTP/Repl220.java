package com.CTP;


/*
Format the String: Write the logic to format the string in the below given format xxx-xxx-xxx
after each 3 digits there should be dash("-") if there are any spaces in the input remove those

input ["00-44 48 555555"]

output ["004-448-555-555"]

input ["00-44 48 555"]

output["004-448-555"]

input ["00-44 #$% 48 55"]

output ["004-448-55"]
 */
public class Repl220 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String input="00-44 #$% 48 55";
        System.out.println(formatString(input));
    }
    public static String formatString(String S){
    StringBuilder sb=new StringBuilder();
    String output=S.replaceAll("[^0-9]","");
    for(int i=0;i<output.length();i+=3){
        for(int j=i;j<i+3;j++){
            if(j<output.length()) {
                sb.append(output.charAt(j));
            } else{
                break;
            }
        }
        if(i<output.length()-3){
            sb.append("-");
        }
    }
    return sb.toString();
    }
}
