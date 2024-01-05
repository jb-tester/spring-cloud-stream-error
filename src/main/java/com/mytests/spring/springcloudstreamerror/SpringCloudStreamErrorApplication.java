package com.mytests.spring.springcloudstreamerror;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;

@SpringBootApplication
public class SpringCloudStreamErrorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudStreamErrorApplication.class, args);
    }



    @ServiceActivator(inputChannel = "mydestination.myGroup.errors")
    public void error(Message<?> message) {
        System.out.println("Handling ERROR: " + message);
    }
}
