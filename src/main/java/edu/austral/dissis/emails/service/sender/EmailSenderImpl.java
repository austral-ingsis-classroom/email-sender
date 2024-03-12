package edu.austral.dissis.emails.service.sender;

public class EmailSenderImpl implements EmailSender {
  @Override
  public void sendEmail(String to, String body) {
    System.out.println("Sending email to " + to + " with body: " + body);
  }
}
