package com.example.samplestsproduct.config;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Messageconsumer {

    @Value(value = "${spring.kafka.producer.group-id}")
    private String GROUP_ID;

    @Value(value = "${topic.name}")
    private String TOPIC_NAME;

    private static final Logger logger = LoggerFactory.getLogger(KafkaConsumer.class);

    @KafkaListener(groupId="${spring.kafka.producer.group-id}", topics="${topic.name}", containerFactory="${KAFKA_LISTENER_CONTAINER_FACTORY}")
    public void receivedMessage(String message) {
        logger.info("Json message received using Kafka listener " + message);
    }
}
