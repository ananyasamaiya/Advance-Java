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

public class EmailSender {
    public static void sendEmail(String to, String subject, String msg){
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
            // mm.setFrom("ISRCD EMAIL..."); exception
            // mm.setFrom("ananya@gmail.com"); not send
            mm.setFrom("samaiyaananya1@gmail.com");
            mm.setRecipients(Message.RecipientType.TO,to);
            mm.setSubject(subject);
            // mm.setText(msg);
            mm.setContent(msg,"text/html");

            Transport.send(mm);
        }catch(MessagingException e){
            e.printStackTrace();
        }
    }
}


class MailAuthenticator extends Authenticator{
    public PasswordAuthentication getPasswordAuthentication(){
        return new PasswordAuthentication("samaiyaananya1@gmail.com","sbwczzmrekydvmmo");
    }
}