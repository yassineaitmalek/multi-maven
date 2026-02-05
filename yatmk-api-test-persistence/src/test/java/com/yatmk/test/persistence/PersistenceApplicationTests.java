package com.yatmk.test.persistence;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@SpringBootConfiguration
@EnableAutoConfiguration
public class PersistenceApplicationTests {

  @Test
  public void contextLoads() {
    // This is an empty test that only verifies if the Spring application context
    // loads successfully.
    assertTrue(true);
  }

}
