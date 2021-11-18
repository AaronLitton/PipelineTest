package com.revature.servlet;

/**
 * Servlet - Interface
 * GenericServlet - Abstract class
 * HttpServlet - Abstract Class
 * MyServlet(HelloServlet) - Concrete Class
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet Lifecycle
 * init - initial state of the servlet
 * service - wired up and available for service within the servlet container'
 * destroy - decomission the servlet and alow it to be garbage collected
 */

@WebServlet(value = "/index")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // this endpoint will print hello world from servlets
        // headers - such as content type
        //
        resp.setHeader("Content-Type", "text/html");
        resp.setStatus(400);
        resp.getOutputStream().println("<h2 style=\"color: red\"> Hello from a servlet configured with <em> annotations</em></h2>");
    }
}
