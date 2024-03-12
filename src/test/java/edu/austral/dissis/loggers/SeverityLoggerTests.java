package edu.austral.dissis.loggers;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class SeverityLoggerTests {

  static final String INFO_LOG_TYPE = "INFO";
  static final String WARN_LOG_TYPE = "WARN";
  static final String ERROR_LOG_TYPE = "ERROR";

  @Test
  public void errorLoggerShouldFilterNonErrorLogs() {
    // Create empty collector
    final SimpleCollector<String> collector = new SimpleCollector<>();
    // Create logger instance
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")
    // logger.log(WARN_LOG_TYPE, "Things could be better 😥")
    // logger.log(ERROR_LOG_TYPE, "We are doomed 😱")

    // Check final logs
    assertIterableEquals(List.of("[ERROR] We are doomed 😱"), collector.getCollectedElements());
  }

  @Test
  public void warnLoggerShouldFilterNonWarnOrErrorLogs() {
    // Create empty collector
    final SimpleCollector<String> collector = new SimpleCollector<>();
    // Create logger instance
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")
    // logger.log(WARN_LOG_TYPE, "Things could be better 😥")
    // logger.log(ERROR_LOG_TYPE, "We are doomed 😱")

    // Check final logs
    assertIterableEquals(
        List.of("[WARN] Things could be better 😥", "[ERROR] We are doomed 😱"),
        collector.getCollectedElements());
  }

  @Test
  public void infoLoggerShouldNotFilterAnyLogs() {
    // Create empty collector
    final SimpleCollector<String> collector = new SimpleCollector<>();
    // Create logger instance
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")
    // logger.log(WARN_LOG_TYPE, "Things could be better 😥")
    // logger.log(ERROR_LOG_TYPE, "We are doomed 😱")

    // Check final logs
    assertIterableEquals(
        List.of(
            "[INFO] Everything is fine 🙂",
            "[WARN] Things could be better 😥",
            "[ERROR] We are doomed 😱"),
        collector.getCollectedElements());
  }
}
