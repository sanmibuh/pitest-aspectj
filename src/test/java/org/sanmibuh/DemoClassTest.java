package org.sanmibuh;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DemoClassTest {

  private final DemoClass subject = new DemoClass();

  @Test
  void init() {
    assertEquals(3, subject.init());
  }
}
