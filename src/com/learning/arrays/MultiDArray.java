package com.learning.arrays;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] b;
        b = new int[2][2];
        b[0][0]=0;
        b[0][1]=1;
        b[1][0]=2;
        b[1][1]=3;
        for (int i=0;i<b.length;i++){
            int[] a=b[i];
            for(int x:a){
                System.out.print(x+" ");
            }
            System.out.println(" ");
        }
        int[][] mArray={{0,1},{2,3}};
    }
}
