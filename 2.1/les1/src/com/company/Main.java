package com.company;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Main extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res) {
        res.setStatus(200);
        PrintWriter pw = null;
        try {
            pw = res.getWriter();
            pw.println("<h1>Ok</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
