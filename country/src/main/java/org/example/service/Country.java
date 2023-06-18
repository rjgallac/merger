package org.example.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Country extends HttpServlet {


    private Gson gson = new GsonBuilder().serializeNulls().create();

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        Map<ConsentEnum, Boolean> toApply = new HashMap<>();
        toApply.put(ConsentEnum.MAIL, false);
        toApply.put(ConsentEnum.TEXT, true);
        String employeeJsonString = this.gson.toJson(toApply);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        out.print(employeeJsonString);
        out.flush();
    }
}
