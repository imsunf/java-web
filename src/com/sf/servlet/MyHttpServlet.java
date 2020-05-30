package com.sf.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sf
 * 2020/5/29
 */
@WebServlet("/myhttp")
public class MyHttpServlet extends MyGenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) servletRequest; // 父类对象强转子类
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // 获取请求类型
        String method = request.getMethod();
        switch (method){
            case "GET":
                doGet(request, response);
                break;
            case "POST":
                doPost(request, response);
            default:
                break;

        }
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

    }
}
