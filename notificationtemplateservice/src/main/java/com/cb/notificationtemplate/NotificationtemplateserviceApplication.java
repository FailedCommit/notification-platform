package com.cb.notificationtemplate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NotificationtemplateserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationtemplateserviceApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        // Notification Preference service
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }

}
