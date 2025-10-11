package controllers;

import javax.servlet.http.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.*;

@WebServlet("/act.do")
public class ShowServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{

        State Madhya_Pradesh = new State(1,"Madhya Pradesh");
        State Uttar_Pradesh = new State(2,"Uttar Pradesh");
        State Gujarat = new State(3,"Gujarat");
        State Maharashtra = new State(4,"Maharashtra");

        City[] cities = { new City(1,"Jabalpur",Madhya_Pradesh),
                        new City(2,"Indore",Madhya_Pradesh),  
                        new City(3,"Bhopal",Madhya_Pradesh),  
                        new City(4,"Rewa",Madhya_Pradesh),
                        new City(1,"Lucknow",Uttar_Pradesh),
                        new City(2,"Agra",Uttar_Pradesh),
                        new City(3,"Kanpur",Uttar_Pradesh),
                        new City(4,"Prayagraj",Uttar_Pradesh),
                        new City(1,"Ahmedabad",Gujarat),
                        new City(2,"Gandhinagar",Gujarat),
                        new City(3,"Jamnagar",Gujarat),
                        new City(4,"Surat",Gujarat),
                        new City(1,"Mumbai",Maharashtra),
                        new City(2,"Pune",Maharashtra),
                        new City(3,"Nagpur",Maharashtra),
                        new City(4,"Nashik",Maharashtra)
        };
        String getStateParameter = request.getParameter("state");
        response.setContentType("text/html");

        PrintWriter pw = response.getWriter();

        pw.write("<html>");
        pw.write("<head>");
        pw.write("<title>Servlet Response</title>");
        pw.write("</head>");
        pw.write("<body>");
        pw.write("<h1>Cities</h1>");
        pw.write("<hr>");
        pw.write("<table border = '1' align='center'");
        switch(getStateParameter){
            case "Madhya_Pradesh":
                for(City city : cities){
                    if(city.state.state_id == 1){
                        pw.write("<tr><td><p>" + city.city_name + "</p></td></tr>");
                    }
                }
                break;
            case "Uttar_Pradesh":
                for(City city : cities){
                    if(city.state.state_id == 2){
                        pw.write("<tr><td><p>" + city.city_name + "</p></td></tr>");
                    }
                }
                break;
            case "Gujarat":
                for(City city : cities){
                    if(city.state.state_id == 3){
                        pw.write("<tr><td><p>" + city.city_name + "</p></td></tr>");
                    }
                }
                break;
            case "Maharashtra":
                for(City city : cities){
                    if(city.state.state_id == 3){
                        pw.write("<tr><td><p>" + city.city_name + "</p></td></tr>");
                    }
                }
                break;
            
        }
        pw.write("</table>");
        pw.write("</body>");
        pw.write("</html>");

        pw.close();
    }
}