package com.CTP;

import java.util.*;

/*
Count the number of repetations of words in an ArrayList append that count and return that list.
You need to implent a function countDeviceNames that takes an ArrayList as an input and returns an ArrayList

input ["switch","tv","switch","tv","switch","tv"]

output [switch, tv, switch1, tv1, switch2, tv2]

In this example as word switch is repeated we pick the next entry where it is repeated
and append the count i.e how many times that word was present previously

More Exmaples

input ["switch","tv","switch","tv","switch","tv","radio"]

output [switch, tv, switch1, tv1, switch2, tv2, radio]

input ["switch","tv","switch","tv"]

output [switch, tv, switch1, tv1]

if words are not repeated we get the same output

input ["switch","tv"]

output [switch, tv]
 */
public class Repl218 {
    public static void main(String[] args) {
        String[] input={"switch","tv","switch","tv","switch","tv","radio"};
        ArrayList<String> inputList=new ArrayList<>();
        for(String s:input){
            inputList.add(s);
        }
        System.out.println(inputList);
        System.out.println(countDeviceNames(inputList));

    }

    public static List<String> countDeviceNames(List<String> deviceNames) {
        String [] devices=new String[deviceNames.size()];

        for(int i=0;i<deviceNames.size();i++){
            String device= deviceNames.get(i);
            boolean duplFlag=false;
            for(int j=0;j<i;j++) {
                if (devices[j].equals(device)){
                    duplFlag=true;
                    break;
                }
            }
            if(duplFlag==false){
                devices[i]=device;
            }else{
                int count=1;
                boolean existFlag=true;
                while(existFlag){
                    existFlag=false;
                    for(int j=0;j<i;j++){
                        if(devices[j].equals(device+count)){
                            existFlag=true;
                            count++;
                            break;
                        }
                    }
                }
                devices[i]=device+count;
            }
        }

        return Arrays.asList(devices);
    }

}
