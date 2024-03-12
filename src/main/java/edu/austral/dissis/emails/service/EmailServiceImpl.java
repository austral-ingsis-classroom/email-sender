package edu.austral.dissis.emails.service;

import edu.austral.dissis.emails.service.sender.EmailSender;
import java.util.List;

public class EmailServiceImpl implements EmailService {

  private final EmailSender emailSender;

  public EmailServiceImpl(EmailSender emailSender) {
    this.emailSender = emailSender;
  }

  @Override
  public SendEmailResult sendEmail(String to, String template, List<Object> templateArgs) {
    try {
      final String body = String.format(template, templateArgs.toArray());
      emailSender.sendEmail(to, body);
      return SendEmailResult.success();
    } catch (Exception e) {
      return SendEmailResult.error(e);
    }
  }
}
