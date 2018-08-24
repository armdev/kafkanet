package io.project.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import io.project.model.UserRequest;


@Component
public class ReplyingKafkaConsumer {

    @KafkaListener(topics = "${kafka.topic.request-topic}")
    @SendTo
    public UserRequest listen(UserRequest request) throws InterruptedException {

        UserRequest response = new UserRequest();
        response.setCompanyId(68L);
        response.setCompanyName("AdiBas");
        response.setEmail("adibas@gmail.com");
        response.setUserId(102L);

        return response;
    }

}
