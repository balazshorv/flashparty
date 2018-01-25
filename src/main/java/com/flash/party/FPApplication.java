package com.flash.party;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class FPApplication {

  public static void main(final String[] args) {
    SpringApplication.run(FPApplication.class, args);
  }
}
