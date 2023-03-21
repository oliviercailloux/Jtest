package io.github.oliviercailloux.test;

import java.io.StringReader;
import javax.xml.transform.stream.StreamSource;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyTests {
  @SuppressWarnings("unused")
  private static final Logger LOGGER = LoggerFactory.getLogger(MyTests.class);

  @Test
  void testSomething() throws Exception {
    LOGGER.info("Started tests.");
    new StreamSource(new StringReader(""));
  }
}
