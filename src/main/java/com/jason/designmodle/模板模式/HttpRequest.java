package com.jason.designmodle.模板模式;

public class HttpRequest extends Request{
    @Override
    String doHandle() {
        System.out.println("handle the servlet request");
        return "HTTP request";
    }
}
