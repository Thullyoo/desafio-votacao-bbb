package br.thullyoo.microservice_receive_vote;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class MicroserviceRecieveVoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceRecieveVoteApplication.class, args);
	}

}
