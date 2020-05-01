package com.jiker.keju;

import org.junit.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

public class FileUtilTest {

    @Test
    public void readFileByLines() throws Exception {
        List<String> list = new FileUtil().readFileByLines("testData.txt");
        assertEquals(list.size(), 4);
        assertEquals(list.get(0), "1公里,等待0分钟");
        assertEquals(list.get(1), "3公里,等待0分钟");
        assertEquals(list.get(2), "10公里,等待0分钟");
        assertEquals(list.get(3), "2公里,等待3分钟");
    }
}