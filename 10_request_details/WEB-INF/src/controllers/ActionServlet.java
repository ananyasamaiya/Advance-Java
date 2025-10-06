package controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;

public class ActionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
        String localAddr = request.getLocalAddr();
        String remoteAddr = request.getRemoteAddr();
        String protocol = request.getProtocol();
        int remotePort = request.getRemotePort();
        int localPort = request.getLocalPort();
        int serverPort = request.getServerPort();
        String serverName = request.getServerName();
        boolean isSecure = request.isSecure();
        String scheme = request.getScheme();


        System.out.println("Local Address: " + localAddr);
        System.out.println("Remote Address: " + remoteAddr);
        System.out.println("Protocol: " + protocol);
        System.out.println("Local Port: " + localPort);
        System.out.println("Server Port: " + serverPort);
        System.out.println("Remote Port: " + remotePort);
        System.out.println("Server Name: " + serverName);
        System.out.println("Is Secure: " + isSecure);
        System.out.println("Scheme: " + scheme);
    }
}