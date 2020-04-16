package ru.itis.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ActorsServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActorsServiceApplication.class, args);
    }

}
