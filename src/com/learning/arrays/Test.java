package com.learning.arrays;

public class Test {
    public static void main(String[] args) {
        // array datatype used to store a fixed number of same type of variable ,
        //we can create array of same type of objects
        // declaration
        int[] rollNumbers;
        //creation
        rollNumbers=new int[4];  //once array created we cannot change length
        //initialization
        rollNumbers[0]= 10;
        rollNumbers[1]= 1;
        rollNumbers[2]= 20;
        rollNumbers[3]= 15;

        for(int x :rollNumbers){
            System.out.println(x);
        }
        // all in one step
        int[] arr2={10,50,100,10000,1000};
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

    }
}

