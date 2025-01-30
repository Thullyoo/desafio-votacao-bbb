package br.thullyoo.microservice_send_vote.controller;

import br.thullyoo.microservice_send_vote.model.Vote;
import br.thullyoo.microservice_send_vote.service.SenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vote")
public class SenderController {

    @Autowired
    private SenderService senderService;

    @PostMapping
    public ResponseEntity<Void> sendVote(@RequestBody Vote vote){
        try {
            senderService.sendVote(vote);
            return ResponseEntity.ok().build();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return ResponseEntity.badRequest().body(null);
        }
    }

}
