package edu.austral.dissis.emails.service;

public class SendEmailResult {

  private Exception exception;
  private final boolean successful;

  public static SendEmailResult success() {
    return new SendEmailResult();
  }

  public static SendEmailResult error(Exception e) {
    return new SendEmailResult(e);
  }

  private SendEmailResult(Exception exception) {
    this.successful = false;
    this.exception = exception;
  }

  private SendEmailResult() {
    this.successful = true;
  }

  public boolean isSuccessful() {
    return successful;
  }

  public boolean isError() {
    return !successful;
  }

  public Exception getException() {
    return exception;
  }
}
