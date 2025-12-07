package controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Transport;

@WebServlet("/send_email.do")
public class SendEmailServlet extends HttpServlet{
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String email = request.getParameter("email");

        Properties props = new Properties();

        // search gmail smtp to get host and port

        // smtp - Simple Mail Transfer Protocol
        props.put("mail.transport.protocol","smtp");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");

        Session ssn = Session.getInstance(props,new MailAuthenticator());

        // Mime full form - multipurpose internet mail extensions 

        MimeMessage mm = new MimeMessage(ssn);
        try{
            mm.setFrom("samaiyaananya1@gmail.com");
            mm.setRecipients(Message.RecipientType.TO,email);
            mm.setSubject("Email Sending Test");
            mm.setText("Yamraj ki jay...");

            Transport.send(mm);
        }catch(MessagingException e){
            e.printStackTrace();
        }
        request.getRequestDispatcher("index.html").forward(request,response);
    }
}

class MailAuthenticator extends Authenticator{
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication("samaiyaananya1@gmail.com","sbwczzmrekydvmmo");
    }
}