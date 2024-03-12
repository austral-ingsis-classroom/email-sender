package edu.austral.dissis.emails.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import edu.austral.dissis.emails.service.sender.TestEmailSender;
import java.util.List;
import org.junit.jupiter.api.Test;

class EmailServiceTest {

  private final String toEmail = "test@email.com";

  @Test
  void emailSenderShouldFillStringParametersCorrectly() {

    TestEmailSender emailSender = new TestEmailSender();
    EmailService emailService = new EmailServiceImpl(emailSender);
    final SendEmailResult result = emailService.sendEmail(toEmail, "Hello %s, welcome to the system!", List.of("John"));

    assertTrue(result.isSuccessful());
    assertEquals("Hello John, welcome to the system!", emailSender.getLastEmailSent());
  }

  @Test
  void emailSenderShouldFillMultipleStringParameters() {

    TestEmailSender emailSender = new TestEmailSender();
    EmailService emailService = new EmailServiceImpl(emailSender);
    final SendEmailResult result = emailService.sendEmail(
        toEmail,
        "Hello %s, welcome to the system! Your username is %s",
        List.of("John", "john123"));

    assertTrue(result.isSuccessful());
    assertEquals(
        "Hello John, welcome to the system! Your username is john123",
        emailSender.getLastEmailSent());
  }

  @Test
  void emailSenderShouldFillNumericParameters() {

    TestEmailSender emailSender = new TestEmailSender();
    EmailService emailService = new EmailServiceImpl(emailSender);
    final SendEmailResult result = emailService.sendEmail(toEmail, "Hello %s, your account balance is $%d", List.of("John", 100));

    assertTrue(result.isSuccessful());
    assertEquals("Hello John, your account balance is $100", emailSender.getLastEmailSent());
  }

  @Test
  void emailSenderShouldFailIfNoParametersAreGiven() {

    TestEmailSender emailSender = new TestEmailSender();
    EmailService emailService = new EmailServiceImpl(emailSender);
    SendEmailResult result =
        emailService.sendEmail(toEmail, "Hello %s, welcome to the system!", List.of());

    assertTrue(result.isError());
  }
}
