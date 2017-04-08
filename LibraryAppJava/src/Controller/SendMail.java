package Controller;



import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;


public class SendMail {

	public static void sendMail(String recipientEmail,String subject,String text){
		final String username = "osxunixl@gmail.com";
		final String password = "Osxunix97";

		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");

		Session session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("from-email@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(recipientEmail));
			message.setSubject(subject);
			message.setText(text);

			Transport.send(message);
                        JOptionPane.showMessageDialog(null,"Gửi thành công!","Email",JOptionPane.INFORMATION_MESSAGE);
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
