package br.thullyoo.microservice_send_vote;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class MicroserviceSendVoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSendVoteApplication.class, args);
	}

}
