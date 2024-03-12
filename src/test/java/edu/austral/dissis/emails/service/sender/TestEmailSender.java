package edu.austral.dissis.emails.service.sender;

public class TestEmailSender implements EmailSender {

  private String lastEmailSent;

  public void sendEmail(String to, String body) {
    lastEmailSent = body;
  }

  public String getLastEmailSent() {
    return lastEmailSent;
  }
}
