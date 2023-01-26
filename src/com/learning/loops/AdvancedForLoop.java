package com.learning.loops;

public class AdvancedForLoop {
    public static void main(String[] args) {
        int[] rollNumbers;

        rollNumbers=new int[4];

        rollNumbers[0]= 10;
        rollNumbers[1]= 1;
        rollNumbers[2]= 20;
        rollNumbers[3]= 15;
// for(varible : container){statement}
        for(int x :rollNumbers){
            System.out.println(x);
        }
    }
}
