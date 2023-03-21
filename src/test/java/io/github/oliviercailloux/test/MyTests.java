package io.github.oliviercailloux.test;

import java.io.StringReader;
import javax.xml.transform.stream.StreamSource;

public class MyTests {

  void testSomething() throws Exception {
    new StreamSource(new StringReader(""));
  }
}
