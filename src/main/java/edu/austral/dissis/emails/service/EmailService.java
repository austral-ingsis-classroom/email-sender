package edu.austral.dissis.emails.service;

import java.util.List;

public interface EmailService {

  SendEmailResult sendEmail(String to, String template, List<Object> templateArgs);
}
