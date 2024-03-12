package edu.austral.dissis.emails.service.sender;

public interface EmailSender {

  void sendEmail(String to, String body);
}
