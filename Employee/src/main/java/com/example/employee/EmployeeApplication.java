package com.example.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableFeignClients
public class EmployeeApplication {

    // RestTemplate
    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }

    //webClient
    @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }
    public static void main(String[] args) {
        SpringApplication.run(EmployeeApplication.class, args);
    }

}
