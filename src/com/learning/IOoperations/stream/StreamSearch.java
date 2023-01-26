package com.learning.IOoperations.stream;

import java.io.*;

public class StreamSearch {
    File file = new File("C:\\Users\\salah\\IdeaProjects\\helloworld\\src\\com\\learning\\IOoperations\\policies.csv");
    BufferedReader bf = new BufferedReader(new FileReader(file));

    public StreamSearch() throws FileNotFoundException {
    }

    public String srearchById(String id) throws IOException {
        String line = bf.readLine();
        if (id.length() == 6) {
            while ((line = bf.readLine()) != null) {
                String data[] = line.split(",");
                if (data[0].equals(id)) {
                    return "data:" + id + "\n" +
                            "   statecode          :" + data[1] + "\n" +
                            "   eq site            :" + data[3] + "\n" +
                            "   hu site            :" + data[4] + "\n" +
                            "   point granularity  :" + data[17] + "\n" +
                            "   construction       :" + data[16];
                }
            }
        } else {
            return "enter valid 6 digit id";
        }
        return "";
    }
}
