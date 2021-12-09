package com.HackerRank;

public class TowerBreakers {
    public static void main(String[] args) {
        System.out.println(towerBreakers(3,4));
    }
    public static int towerBreakers(int n, int m) {
        // Write your code here
        int move=0;
        if(m==1){
            move=2;
        }
        if(n%2==1 && m>1){
            move=1;
        }
        if(n%2==0 && m>1){
            move=2;
        }
        
    return move;
    }

}
