package br.univille.projcolabassistant.service;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component("newMailSender")
public class MailSender {

	/*
	 * Sending emails using this class
	 *
	 * ...
	 * public MailSender mailSender;
	 *
	 * String from = "springboot.dacs@gmail.com";
	 * String to = "springboot.dacs+emailtest@gmail.com";
	 * String subject = "JavaMailSenderTest";
	 * String body = "Testing!";
	 * mailSender.sendMail(from, to, subject, body);
	 * ...
	 *
	 * */

	@Autowired
	JavaMailSender javaMailSender;

	Logger logger = LoggerFactory.getLogger(this.getClass());

	public void sendMail(String from, String to, String subject, String body) {
		try {
			SimpleMailMessage mail = new SimpleMailMessage();

			mail.setFrom(from);
			mail.setTo(to);
			mail.setSubject(subject);
			mail.setText(body);

			logger.info("Sending...");

			javaMailSender.send(mail);

			logger.info("Done!");
		}catch (Exception e) {
			logger.error("Erro ao enviar email", e);
		}
	}

}
