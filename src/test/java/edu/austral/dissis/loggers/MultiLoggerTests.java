package edu.austral.dissis.loggers;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class MultiLoggerTests {

  static final String INFO_LOG_TYPE = "INFO";

  @Test
  public void multiLoggerShouldSendLogToOneSubLogger() {
    // Create one empty collector
    final SimpleCollector<String> collector = new SimpleCollector<>();
    // Create logger instance with one sublogger
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")

    // Check final logs
    assertIterableEquals(List.of("[INFO] Everything is fine 🙂"), collector.getCollectedElements());
  }

  @Test
  public void multiLoggerShouldSendLogToTwoSubLoggers() {
    // Create two empty collectors
    final SimpleCollector<String> collector1 = new SimpleCollector<>();
    final SimpleCollector<String> collector2 = new SimpleCollector<>();
    // Create logger instance with two subloggers
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")

    // Check final logs
    assertIterableEquals(
        List.of("[INFO] Everything is fine 🙂"), collector1.getCollectedElements());

    assertIterableEquals(
        List.of("[INFO] Everything is fine 🙂"), collector2.getCollectedElements());
  }

  @Test
  public void multiLoggerShouldSendLogAllLogsToTwoSubLoggers() {
    // Create two empty collectors
    final SimpleCollector<String> collector1 = new SimpleCollector<>();
    final SimpleCollector<String> collector2 = new SimpleCollector<>();
    // Create logger instance with two subloggers
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")
    // logger.log(WARN_LOG_TYPE, "Things could be better 😥")

    // Check final logs
    assertIterableEquals(
        List.of("[INFO] Everything is fine 🙂", "[WARN] Things could be better 😥"),
        collector1.getCollectedElements());

    assertIterableEquals(
        List.of("[INFO] Everything is fine 🙂", "[WARN] Things could be better 😥"),
        collector2.getCollectedElements());
  }
}
