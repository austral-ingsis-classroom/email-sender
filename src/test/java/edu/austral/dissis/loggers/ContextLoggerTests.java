package edu.austral.dissis.loggers;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

public class ContextLoggerTests {

  static final String INFO_LOG_TYPE = "INFO";
  static final String WARN_LOG_TYPE = "WARN";

  @Test
  public void contextLoggerShouldAddCurrentDateToOneLog() {
    // Create empty collector
    final SimpleCollector<String> collector = new SimpleCollector<>();
    // Create logger instance with context (datetime = "2024-03-12T15:00:00Z")
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")

    // Check final logs
    assertIterableEquals(
        List.of("[2024-03-12T15:00:00Z] [INFO] Everything is fine 🙂"),
        collector.getCollectedElements());
  }

  @Test
  public void contextLoggerShouldAddCurrentDateToTwoLogs() {
    // Create empty collector
    final SimpleCollector<String> collector = new SimpleCollector<>();
    // Create logger instance with context (datetime = "2024-03-12T15:00:00Z")
    // final Logger logger = ...

    // Call logger
    // logger.log(INFO_LOG_TYPE, "Everything is fine 🙂")
    // logger.log(INFO_LOG_TYPE, "Everything is still fine 🙂")

    // Check final logs
    assertIterableEquals(
        List.of(
            "[2024-03-12T15:00:00Z] [INFO] Everything is fine 🙂",
            "[2024-03-12T15:00:00Z] [INFO] Everything is still fine 🙂"),
        collector.getCollectedElements());
  }
}
