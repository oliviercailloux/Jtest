package io.github.oliviercailloux.test;

import java.io.StringReader;
import javax.xml.transform.stream.StreamSource;
import org.junit.jupiter.api.Test;

public class MyTests {

  @Test
  void testSomething() throws Exception {
    new StreamSource(new StringReader(""));
  }
}
