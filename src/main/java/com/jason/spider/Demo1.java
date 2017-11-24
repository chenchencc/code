package com.jason.spider;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;

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
