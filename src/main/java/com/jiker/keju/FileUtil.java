package com.jiker.keju;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

    public List<String> readFileByLines(String fileName) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/main/resources/" + fileName)));
        String tripStr;
        List<String> trips = new ArrayList<>();
        while ((tripStr = br.readLine()) != null) {
            trips.add(tripStr);
        }
        br.close();
        return trips;
    }
}
