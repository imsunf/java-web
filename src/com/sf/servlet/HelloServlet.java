package com.sf.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sf
 * 2020/5/30
 */

@WebServlet("/hello")
public class HelloServlet extends MyHttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException { // 记得异常需要在方法里抛出，而不是类上，同时父类的对应方法也需要抛出
        response.getWriter().write("hello get");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("hello post");
    }
}
