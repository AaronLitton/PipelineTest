package com.revature.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.model.Cat;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(value = "/json")
public class JSONServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setHeader("Content-Type", "application/json");
        resp.setStatus(200);
        resp.getOutputStream().println("{\"username\":\"ALitton\",\"password\":\"1234\",\"object\":{\"key\":\"value\"}}");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        //Take information in JSON format
        Enumeration<String> headers = req.getHeaderNames();
        while(headers.hasMoreElements()){
            String header = headers.nextElement();
            System.out.printf("%s : %s\n ",header,req.getHeader(header));
        }


        Enumeration<String> params = req.getParameterNames();
        while(params.hasMoreElements()){
            String param = params.nextElement();
            System.out.printf("%s : %s \n",param,req.getParameter(param));
        }

        List<String> body = req.getReader().lines().collect(Collectors.toList());
        StringBuilder builder = new StringBuilder();
        //body.stream().forEach( builder::append);
        body.stream().forEach( line -> builder.append(line).append("\n"));

        String streamBody = builder.toString();

        //String collectorBody = req.getReader().lines().collect(Collectors.joining("\n"));
        System.out.println("StreamBody: " + streamBody);
        //System.out.println("CollectorBody: "+ collectorBody);

        ObjectMapper mapper = new ObjectMapper();
        Cat cat = mapper.readValue(streamBody, Cat.class);

        System.out.println(cat);

    }
}
