package utils;

import javax.mail.Session;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.internet.MimeMessage;
import javax.mail.MessagingException;
import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.Transport;

import java.util.Properties;
public class EmailSender{
    public static void sendEmail(String to, String subject, String message){
        Properties props = new Properties();

        props.put("mail.transport.protocol","smtp");
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");

        Session session = Session.getInstance(props,new  AppAuthenticator());

        MimeMessage mm = new MimeMessage(session);

        try{
            mm.setFrom("samaiyaananya1@gmail.com");
            mm.setRecipients(Message.RecipientType.TO,to);
            mm.setSubject(subject);
            mm.setContent(message,"text/html");

            Transport.send(mm);

        }catch(MessagingException e){
            e.printStackTrace();
        }
    }
}

class AppAuthenticator extends Authenticator{
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication("samaiyaananya1@gmail.com","sbwczzmrekydvmmo");
    }
}