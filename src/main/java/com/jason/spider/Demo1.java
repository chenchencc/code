package com.jason.spider;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Demo1 {
    @Test
    public void test() throws IOException {
        URL url = new URL("http://source.jd.com/app/ebcf-IMBox");//爬取的网址、这里爬取的是一个生物网站
        URLConnection urlconn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(
                urlconn.getInputStream()));
        br.lines().forEach(System.out::println);
    }
}
