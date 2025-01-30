package br.thullyoo.microservice_receive_vote.consumer;

import br.thullyoo.microservice_receive_vote.dto.VoteReceive;
import br.thullyoo.microservice_receive_vote.model.Vote;
import br.thullyoo.microservice_receive_vote.services.VoteService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class VoteConsumer {

    @Autowired
    private VoteService voteService;

    @RabbitListener(queues = {"${queue.name}"})
    public void receive(@Payload VoteReceive voteReceive){
        try {
            Vote vote = voteService.registerVote(voteReceive);
            System.out.println("Vote registered : " + vote.toString());
        } catch (RuntimeException e) {
            System.err.println("Error processing vote: " + e.getMessage());
        }
    }

}

