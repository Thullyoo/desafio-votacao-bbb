package br.thullyoo.microservice_send_vote.service;

import br.thullyoo.microservice_send_vote.model.Vote;
import br.thullyoo.microservice_send_vote.producer.SenderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderService {

    @Autowired
    private SenderProducer senderProducer;

    public void sendVote(Vote vote){
        senderProducer.send(vote);
    }

}
