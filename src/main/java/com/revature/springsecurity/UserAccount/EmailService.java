package com.revature.springsecurity.UserAccount;

//Wrapper for JavaMailSender. Use @async with sendemail so it doesn't have to wait on send operation to finish to continue.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailService {

  private JavaMailSender mailSender;

  @Autowired
  public EmailService(JavaMailSender mailSender) {
    this.mailSender = mailSender;
  }
  
  @Async
  public void sendEmail(SimpleMailMessage email) {
    mailSender.send(email);
  }
}