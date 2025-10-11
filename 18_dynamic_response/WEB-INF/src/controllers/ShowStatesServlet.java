package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.State;

@WebServlet("/show_states.do")
public class ShowStatesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        State[] states = {
            new State(1, "MP"),
            new State(2, "UP"),
            new State(3, "MH"),
        };

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<form action='show_cities.do'>");

        pw.write("<select name='state_id' style='margin:100px;font-size:32px'>");
        pw.write("<option>Select</option>");
        for(State state : states)
            pw.write("<option value='" + state.getStateId() + "'>" + state.getStateName() + "</option>");
        pw.write("</select>");

        pw.write("<input type='submit' value='Show Cities'>");
        pw.write("</form>");

        pw.close();
    }
}