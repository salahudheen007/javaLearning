package com.learning.IOoperations.nonStream;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        File myfile = new File("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\IOoperations\\policies.csv");
        FileReader fr = null;
        try {
            fr = new FileReader(myfile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bf = new BufferedReader(fr);
        ArrayList<Policy> ar = new ArrayList<>();
        String data;
        data = bf.readLine();
        while ((data = bf.readLine()) != null) {
            Policy p = new Policy(data);
            ar.add(p);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("search by id(a) or construction type(b)");
        String option = sc.nextLine();
        if (option.equals("a")) {
            System.out.println("enter the id");
            int id = sc.nextInt();
            if (id >= 100000 && id <= 999999) {
                for (int i = 0; i < ar.size(); i++) {
                    Policy mypolicy =  ar.get(i);
                    if (id == mypolicy.getId()) {
                        System.out.println(mypolicy);
                        return;
                    }
                }
                System.out.println("id not found");
            } else {
                System.out.println("enter valid id");
            }
        } else if (option.equals("b")) {
            int granularitySum = 0, count = 0;
            System.out.println("enter construction type");
            String constrctionType = sc.nextLine();
            for (int i = 0; i < ar.size(); i++) {
                Policy mypolicy = (Policy) ar.get(i);
                if (constrctionType.equals(mypolicy.getConstructionType())) {
                    count++;
                    granularitySum = granularitySum + mypolicy.getPointGranularity();
                }
            }
            if (count != 0) {
                System.out.println("sum Granularity : " + granularitySum + "\n" + "count : " + count);
            }else {
                System.out.println("construction type not found");
            }
        } else {
            System.out.println("enter a valid option");
        }



    }
}
