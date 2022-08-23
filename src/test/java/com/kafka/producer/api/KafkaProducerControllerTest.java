package com.kafka.producer.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.kafka.core.KafkaTemplate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class KafkaProducerControllerTest {

    @Mock
    private KafkaTemplate<String, Object> template;

    @InjectMocks
    private KafkaProducerController kafkaProducerController;

    @Test
    public void testPublishMessageWithArgs() {
        kafkaProducerController.publishMessage("Shweta");
     //assertEquals("Data published",kafkaProducerController.publishMessage("Shweta"));
     verify(template,times(1)).send(anyString(),anyString());

    }

    @Test
    public void testPublishMessageWithNoArgs() {
        assertEquals("Json Data published",kafkaProducerController.publishMessage());
        verify(template,times(1)).send(anyString(), anyString());
    }
}