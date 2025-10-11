package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.State;
import models.City;

@WebServlet("/show_cities.do")
public class ShowCitiesServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        State[] states = {
            new State(1, "MP"),
            new State(2, "UP"),
            new State(3, "MH"),
        };

        Integer stateId = Integer.parseInt(request.getParameter("state_id"));

        City[] cities = {
            new City(1, "Jabalpur", states[0]),
            new City(2, "Bhopal", states[0]),
            new City(3, "Indore", states[0]),
            new City(4, "Gwalior", states[0]),
            new City(5, "Lacknow", states[1]),
            new City(6, "Kanpur", states[1]),
            new City(7, "Prayagraj", states[1]),
            new City(8, "Varansi", states[1]),
            new City(9, "Nagpur", states[2]),
            new City(10, "Pune", states[2]),
            new City(11, "Nasik", states[2]),
            new City(12, "Mumbai", states[2])
        };

        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<select style='margin:100px;font-size:32px'>");
        pw.write("<option>Select</option>");
        for(City city : cities) {
            if(city.getState().getStateId().equals(stateId)) {
                pw.write("<option value='" + city.getCityId() + "'>" + city.getCityName() + "</option>");
            }
        }
        pw.write("</select>");
        

        pw.close();
    }
}