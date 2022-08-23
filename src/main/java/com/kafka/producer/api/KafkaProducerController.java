package com.kafka.producer.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaProducerController {

    @Autowired
    private KafkaTemplate<String, Object> template;

    private final String topic = "TEST_TOPIC";

    @GetMapping("/publish/{name}")
    public String publishMessage(@PathVariable String name) {
        template.send(topic, "Hi " + name + " Welcome to java techie");
        return "Data published";
    }

    @GetMapping("/publishJson")
    public String publishMessage() {
        String massage ="First Message";
        template.send(topic, massage);
        return "Json Data published";
    }
}
