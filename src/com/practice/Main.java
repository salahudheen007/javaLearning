package com.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int i = 3;
        int[][] b=new int[5][5];
        b[0]= new int[]{1, 1, 0, 0, 0};
        b[1]= new int[]{1,1,1,1,0};
        b[2]= new int[]{1,0,0,0,0};
        b[3]= new int[]{1,1,0,0,0};
        b[4]= new int[]{1,1,1,1,1};
        System.out.println(new Solution().kWeakestRows(b,i));
    }
}
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
        for(int i=0;i<mat.length;i++){
            int sum=0;
            for(int j=0;j<mat[i].length;j++){
                sum=sum+mat[i][j];
            }
            map.put(sum,i);
        }
        int[] weakest=new int[k];
        List<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()) {
            list.add(entry.getKey());
        }
         Collections.sort(list);
        for (int i=0;i<k;i++){
            weakest[i]=map.get(list.get(i));
        }
        return weakest;
    }
}