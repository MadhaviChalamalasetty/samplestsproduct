package com.example.samplestsproduct.config;

import jakarta.annotation.PostConstruct;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

@Configuration
public class MessageProducer {

    private static final Logger logger = LoggerFactory.getLogger(KafkaProducer.class);

    @Value(value = "${topic.name}")
    private String TOPIC_NAME;

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @PostConstruct
    public void init(){
        String msg = sendMessage();
        System.out.println(" producer msg:"+msg);
    }

    public String sendMessage() {
        try {
            String str = "{msg created}";
            ListenableFuture<SendResult<String, Object>> future =
                    (ListenableFuture<SendResult<String, Object>>) this.kafkaTemplate.send(TOPIC_NAME, str);

            future.addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {

                @Override
                public void onSuccess(SendResult<String, Object> result) {
                    logger.info("successfully sent message = {}, with offset = {}", str,
                            result.getRecordMetadata().offset());
                }

                @Override
                public void onFailure(Throwable ex) {
                    logger.info("Failed to send message = {}, error = {}", str, ex.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "json message sent successfully";
    }

}