/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author Monkey.TNT
 */
public class SendMaillSSL {

    public void SendMail(String tomail, String code) {

        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session;
        session = Session.getDefaultInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("osxunixl@gmail.com", "Osxunix97");
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("osxunixl@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(tomail));
            message.setSubject("Your code !");
            message.setText("Welcom!Thanks you very much."+"\n"+"Code : "+code);
            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

  

}
