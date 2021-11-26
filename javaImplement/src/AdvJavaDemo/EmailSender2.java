package AdvJavaDemo;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender2 {	
	static Scanner  sc = new Scanner(System.in);
	
	public static void main(String[] args) throws MessagingException {
		sendMail("xcaliusomg@gmail.com");
		}

	public static void sendMail(String recepient) throws MessagingException {
		
		//System.out.println("wait... \n mail sending...");
		Properties pr = new Properties();
		
		pr.put("mail.smtp.auth", "true");
		pr.put("mail.smtp.starttls.enable", "true");
		pr.put("mail.smtp.host", "smtp.gmail.com");
		pr.put("mail.smtp.port", "587");
		
//		LoginCred lc = new LoginCred();
//		String acc = lc.getAcc();
//		String pass = lc.getPass();
		
		String acc = "omprakashxcs@gmail.com";
		String pass = "11223344\"";
		
		Session ssn = Session.getInstance(pr,new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(acc, pass);
			}
			
		});
		
		Message msg = transfer(ssn,acc,recepient);		
		Transport.send(msg);		
		System.out.println("send succesfully.");
	}

	private static Message transfer(Session ssn,String acc,String recepient) {
		
		try {
			Message msg = new MimeMessage(ssn);
			msg.setFrom(new InternetAddress(acc));
			msg.setRecipient(Message.RecipientType.TO, new InternetAddress(recepient));
			
			msg.setSubject("subject for mail");
			msg.setText("hi ");
			
			return msg;
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
