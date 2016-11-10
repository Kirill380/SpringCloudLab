package com.redkite.springcloud.lab4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Client4Application {

  public static void main(String[] args) {
    SpringApplication.run(Client4Application.class, args);
  }

}
