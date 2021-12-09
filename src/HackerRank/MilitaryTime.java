package com.HackerRank;

public class MilitaryTime {
    public static void main(String[] args) {
    String time="12:01:00AM";
        System.out.println(timeConversion(time));
    }
    public static String timeConversion(String s) {
        // Write your code here
        StringBuilder sb=new StringBuilder();
             if (s.contains("PM")){
                String[] numbers=s.replaceAll("[A-Za-z]","").split(":");
                if(Integer.parseInt(numbers[0])<12){
                    sb.append((Integer.parseInt(numbers[0])+12)+":"+numbers[1]+":"+numbers[2]);
                }   else if(Integer.parseInt(numbers[0])==12){
                     sb.append(numbers[0]+":"+numbers[1]+":"+numbers[2]);
                }
            }   else if(s.contains("AM")) {
                 String[] numbers = s.replaceAll("[A-Za-z]", "").split(":");
                 if (Integer.parseInt(numbers[0]) < 12) {
                     sb.append(numbers[0]+":"+numbers[1]+":"+numbers[2]);
                 } else if (Integer.parseInt(numbers[0]) == 12) {
                     sb.append("00" + ":" + numbers[1] + ":" + numbers[2]);
                 }
             }

        return sb.toString();
    }
}
