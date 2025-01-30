package br.thullyoo.microservice_send_vote.producer;

import br.thullyoo.microservice_send_vote.model.Vote;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SenderProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    public void send(Vote vote){
        rabbitTemplate.convertAndSend(this.queue.getName(), vote);
    }

}
