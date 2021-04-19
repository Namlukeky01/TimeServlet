package com.example.TimeServlet;

import java.io.*;
import java.util.Date;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        Date today = new Date();

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + today + "</h1>");
        out.println("</html>");
    }

    public void destroy() {
    }
}