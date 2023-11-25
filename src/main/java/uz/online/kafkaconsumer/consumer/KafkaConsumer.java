package uz.online.kafkaconsumer.consumer;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyAutoConfiguration;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class KafkaConsumer {

    @KafkaListener(id = "sampleID", topics = "sample")
    public void sampleListener(String message) {
        log.info("Message recieved: {}", message);
    }
}
