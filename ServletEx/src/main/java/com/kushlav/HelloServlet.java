package com.kushlav;

import org.apache.catalina.startup.Tomcat;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {

    public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
        System.out.println("In service");
        res.setContentType("text/html");

//        res.getWriter().println("Hello World!"); In place of mentioned statement we can use below one as well
        PrintWriter out = res.getWriter();
        out.println("<h2><b>Hello World!</b></h2>");
    }
}
